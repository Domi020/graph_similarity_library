package components.compare;

import components.MetricCalculators.CentralityCalculator;
import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.distance.DistanceMeasures;
import components.generators.GraphGeneratorMethod;
import components.generators.GraphGenerators;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.math3.util.Precision;
import components.python.PythonGenerator;
import components.tendency.CentralTendencies;
import components.tendency.Tendency;
import components.normalize.Normalizer;

import java.util.*;
import java.util.concurrent.*;

@Getter
@Setter
public class GraphCompare {


    private Tendency tendency;
    private Tendency[] tendencies = null;
    private DistanceMeasure distanceMeasure;
    private NodeMetric[] metrics;

    private List<Map<String, Object>> generatorOptions;
    private GraphGeneratorMethod[] generatorMethods;

    ConcurrentLinkedQueue<Double> resList;
    ConcurrentLinkedQueue<Long> timeList;


    private boolean generateGraphVisualizationScript = false;

    public void doDualGraphTest(int amount) {
        double avg = 0.0;
        double max = 0.0;
        double min = 1.0;

        resList = new ConcurrentLinkedQueue<>();
        timeList = new ConcurrentLinkedQueue<>();
        var resArrayList = new ArrayList<Double>();
        var executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        var work = new ArrayList<Future<?>>();

        int successAmount = amount;

        for (int i = 0; i < amount; i++) {
            var x = executor.submit(this::doCalcRun);
            work.add(x);
        }
        for (int i = 0; i < successAmount; i++) {
            try{
                work.get(i).get();
            } catch (Exception e) {
                var x = executor.submit(this::doCalcRun);
                work.add(x);
                successAmount++;
                continue;
            }
            var oneRes = resList.poll();
            avg += oneRes;
            if (oneRes > max) max = oneRes;
            if (oneRes < min) min = oneRes;
            resArrayList.add(oneRes);
        }
        avg = avg / (double) amount;
        double variance = calcVariance(resArrayList, avg);
        LongSummaryStatistics timeStats = timeList.stream().mapToLong(Long::longValue).summaryStatistics();

        System.out.println("Min: " + Double.toString(Precision.round(min, 6)).replace('.', ',')
                + "\nMax: " + Double.toString(Precision.round(max, 6)).replace('.', ',') +
                "\navg: " + Double.toString(Precision.round(avg, 6)).replace('.', ',') +
                "\nVar: " + Double.toString(variance).replace('.', ',') +
                "\nAvgTime: " + Double.toString(Precision.round(timeStats.getAverage() / 1000000.0, 2)).replace('.', ',')
                + "\nSumTime: " + timeStats.getSum() / 1000000);

        executor.shutdown();
    }

    private void doCalcRun() {
        Graph<Integer, Integer> x = GraphGenerators.generateGraph(generatorMethods[0], generatorOptions.get(0));
        Graph<Integer, Integer> y = GraphGenerators.generateGraph(generatorMethods[1], generatorOptions.get(1));

        if (generateGraphVisualizationScript) {
            PythonGenerator.generateGraphDrawer(x, y, true);
        }
        Double[] meansOne = new Double[metrics.length];
        Double[] meansTwo = new Double[metrics.length];
        int j = 0;
        long startTime = System.nanoTime();
        for (var metric : metrics) {
            var valueArrayOne = CentralityCalculator.calculateCentrality(metric, x);
            var valueArrayOneNorm = Normalizer.normalizeNodeMetricArray(valueArrayOne,
                    x.nodes().size(), metric);
            var meanOne = CentralTendencies.calculateTendency(valueArrayOneNorm, tendencies != null ?
                    tendencies[j] : tendency);
            var valueArrayTwo = CentralityCalculator.calculateCentrality(metric, y);
            var valueArrayTwoNorm = Normalizer.normalizeNodeMetricArray(valueArrayTwo,
                    y.nodes().size(), metric);
            var meanTwo = CentralTendencies.calculateTendency(valueArrayTwoNorm, tendencies != null ?
                    tendencies[j] : tendency);
            meansOne[j] = meanOne; meansTwo[j] = meanTwo; j++;
        }
        var res = DistanceMeasures.calculateDistance(meansOne, meansTwo, distanceMeasure);
        res = 1 - Normalizer.normalizeDistanceMeasure(res, metrics.length, distanceMeasure);
        long endTime = System.nanoTime();
        //System.out.print('x');
        resList.add(res);
        timeList.add(endTime - startTime);
        //System.out.println(MetricsCalculation.calculateGraphMetric(x, GraphMetric.SIZE));
        //System.out.println(MetricsCalculation.calculateGraphMetric(y, GraphMetric.SIZE));
    }



    private Double calcVariance(List<Double> res, double avg) {
        double sum = 0;
        for (Double re : res) {
            sum += Math.pow(re - avg, 2);
        }
        return sum / (double) res.size();
    }
}


