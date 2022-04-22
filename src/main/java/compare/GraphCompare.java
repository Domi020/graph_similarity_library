package compare;

import MetricCalculators.CentralityCalculator;
import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.GraphMetric;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import generators.BarabasiAlbertGenerator;
import generators.GraphGeneratorMethod;
import generators.GraphGenerators;
import generators.RMATGenerator;
import lombok.Getter;
import lombok.Setter;
import python.PythonGraphGenerator;
import tendancy.CentralTendencies;
import tendancy.Tendency;
import util.Normalizer;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@Getter
@Setter
public class GraphCompare {


    private Tendency tendency;
    private DistanceMeasure distanceMeasure;
    private NodeMetric[] metrics;

    private List<Map<String, Object>> generatorOptions;
    private GraphGeneratorMethod[] generatorMethods;

    ConcurrentLinkedQueue<Double> resList;
    ConcurrentLinkedQueue<Long> timeList;


    private boolean printGEDScript = false;

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
        System.out.println("Min: " + Double.toString(min).replace('.', ',')
                + "\nMax: " + Double.toString(max).replace('.', ',') +
                "\navg: " + Double.toString(avg).replace('.', ',') +
                "\nVar: " + Double.toString(variance).replace('.', ',') +
                "\nAvgTime: " + Double.toString(timeStats.getAverage()).replace('.', ',')
                + "\nSumTime: " + timeStats.getSum());
        executor.shutdown();
    }

    private void doCalcRun() {
        Graph<Integer, Integer> x = GraphGenerators.generateGraph(generatorMethods[0], generatorOptions.get(0));
        Graph<Integer, Integer> y = GraphGenerators.generateGraph(generatorMethods[1], generatorOptions.get(1));

        if (printGEDScript) {
            //PythonGraphGenerator.generateGEDTest(x, y, true);
            //PythonGraphGenerator.generateGraphDrawer(x, y, true);
            PythonGraphGenerator.generateHistogram(y);
        }
        Double[] meansOne = new Double[metrics.length];
        Double[] meansTwo = new Double[metrics.length];
        int j = 0;
        long startTime = System.nanoTime();
        for (var metric : metrics) {
            var valueArrayOne = CentralityCalculator.calculateCentrality(metric, x);
            var valueArrayOneNorm = Normalizer.normalizeNodeMetricArray(valueArrayOne,
                    x.nodes().size(), metric);
            var meanOne = CentralTendencies.calculateTendency(valueArrayOneNorm, tendency);
            var valueArrayTwo = CentralityCalculator.calculateCentrality(metric, y);
            var valueArrayTwoNorm = Normalizer.normalizeNodeMetricArray(valueArrayTwo,
                    y.nodes().size(), metric);
            var meanTwo = CentralTendencies.calculateTendency(valueArrayTwoNorm, tendency);
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


