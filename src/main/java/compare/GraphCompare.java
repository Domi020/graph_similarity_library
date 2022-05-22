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
import org.apache.commons.math3.util.Precision;
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
    private Tendency[] tendencies = null;
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

       /* System.out.println("Min: " + Double.toString(Precision.round(min, 6)).replace('.', ',')
                + "\nMax: " + Double.toString(Precision.round(max, 6)).replace('.', ',') +
                "\navg: " + Double.toString(Precision.round(avg, 6)).replace('.', ',') +
                "\nVar: " + Double.toString(variance).replace('.', ',') +
                "\nAvgTime: " + Double.toString(Precision.round(timeStats.getAverage() / 1000000.0, 2)).replace('.', ',')
                + "\nSumTime: " + timeStats.getSum() / 1000000); */

//        var avgMetricTime = metricTimes.stream()
//                        .mapToDouble(Long::doubleValue)
//                        .average().getAsDouble();
//        var avgNormTime = normTimes.stream()
//                .mapToDouble(Long::doubleValue)
//                .average().getAsDouble();
//        var avgTendencyTime = tendencyTimes.stream()
//                .mapToDouble(Long::doubleValue)
//                .average().getAsDouble();
//        var avgDistanceTime = distanceTimes.stream()
//                .mapToDouble(Long::doubleValue)
//                .average().getAsDouble();
//        var avgSecNormTime = secNormTimes.stream()
//                .mapToDouble(Long::doubleValue)
//                .average().getAsDouble();

        System.out.println(Double.toString(Precision.round(min, 6)).replace('.', ',') + " & " +
                Double.toString(Precision.round(max, 6)).replace('.', ',') + " & " +
                Double.toString(Precision.round(avg, 6)).replace('.', ',') + " & " +
                Double.toString(variance).replace('.', ',') + " & " +
                Double.toString(Precision.round(timeStats.getAverage() / 1000000.0, 2)).replace('.', ',') + " & ");
        //System.out.println(avgMetricTime / 1000000.0 + ", " + avgNormTime / 1000000.0 + ", " + avgTendencyTime / 1000000.0 + ", " + avgDistanceTime / 1000000.0 + ", "
       //         + avgSecNormTime / 1000000.0 + ", ");
        executor.shutdown();
    }

    List<Long> metricTimes = new ArrayList<>(), normTimes = new ArrayList<>(), tendencyTimes = new ArrayList<>(),
            distanceTimes = new ArrayList<>(), secNormTimes = new ArrayList<>();

    private void doCalcRun() {
        Graph<Integer, Integer> x = GraphGenerators.generateGraph(generatorMethods[0], generatorOptions.get(0));
        Graph<Integer, Integer> y = GraphGenerators.generateGraph(generatorMethods[1], generatorOptions.get(1));

        if (printGEDScript) {
            //PythonGraphGenerator.generateGEDTest(x, y, true);
            PythonGraphGenerator.generateGraphDrawer(x, y, true);
            //PythonGraphGenerator.generateHistogram(y);
        }
        Double[] meansOne = new Double[metrics.length];
        Double[] meansTwo = new Double[metrics.length];

        long metricTimes = 0, normTimes = 0, tendencyTimes = 0;

        int j = 0;
        long startTime = System.nanoTime();
        for (var metric : metrics) {
            var valueArrayOne = CentralityCalculator.calculateCentrality(metric, x);
            long timeForMetric = System.nanoTime() - startTime;
            var valueArrayOneNorm = Normalizer.normalizeNodeMetricArray(valueArrayOne,
                    x.nodes().size(), metric);
            long timeForNorm = System.nanoTime() - startTime - timeForMetric;
            var meanOne = tendencies == null ? CentralTendencies.calculateTendency(valueArrayOneNorm, tendency) :
                    CentralTendencies.calculateTendency(valueArrayOneNorm, tendencies[j]);
            long timeForTendency = System.nanoTime() - startTime - timeForMetric -
                    timeForNorm;
            long timeForGraphOne = System.nanoTime() - startTime;
            var valueArrayTwo = CentralityCalculator.calculateCentrality(metric, y);
            long timeForMetricTwo = System.nanoTime() - startTime - timeForGraphOne;
            var valueArrayTwoNorm = Normalizer.normalizeNodeMetricArray(valueArrayTwo,
                    y.nodes().size(), metric);
            long timeForNormTwo = System.nanoTime() - startTime - timeForGraphOne - timeForMetricTwo;
            var meanTwo = tendencies == null ? CentralTendencies.calculateTendency(valueArrayTwoNorm, tendency) :
                    CentralTendencies.calculateTendency(valueArrayTwoNorm, tendencies[j]);
            long timeForTendencyTwo = System.nanoTime() - startTime - timeForGraphOne - timeForMetricTwo -
                    timeForNormTwo;
            metricTimes = timeForMetric + timeForMetricTwo;
            normTimes = timeForNorm + timeForNormTwo;
            tendencyTimes = timeForTendency + timeForTendencyTwo;
            meansOne[j] = meanOne; meansTwo[j] = meanTwo; j++;
        }
        long timeForCollect = System.nanoTime() - startTime;
        var res = DistanceMeasures.calculateDistance(meansOne, meansTwo, distanceMeasure);
        long timeForDistance = System.nanoTime() - startTime - timeForCollect;
        res = 1 - Normalizer.normalizeDistanceMeasure(res, metrics.length, distanceMeasure);
        long timeForSecNorm = System.nanoTime() - startTime - timeForCollect - timeForDistance;
        long endTime = System.nanoTime();
        this.metricTimes.add(metricTimes);
        this.normTimes.add(normTimes);
        this.tendencyTimes.add(tendencyTimes);
        this.distanceTimes.add(timeForDistance);
        this.secNormTimes.add(timeForSecNorm);
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


