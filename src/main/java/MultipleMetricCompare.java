import MetricCalculators.CentralityCalculator;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import generators.RMATGenerator;
import tendancy.CentralTendencies;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MultipleMetricCompare {


    private Tendency tendency;
    private DistanceMeasure distanceMeasure;
    private NodeMetric[] metrics;

    private double RMATAlpha;
    private double RMATBeta;
    private double RMATGamma;
    private int RMATNodes;
    private int RMATEdges;

    private double RMATAlphaTwo;
    private double RMATBetaTwo;
    private double RMATGammaTwo;
    private int RMATNodesTwo;
    private int RMATEdgesTwo;

    public void setTendency(Tendency tendency) {
        this.tendency = tendency;
    }

    public void setDistanceMeasure(DistanceMeasure measure) {
        this.distanceMeasure = measure;
    }

    public void setMetrics(NodeMetric[] nodeMetrics) {
        this.metrics = nodeMetrics;
    }

    public void setRMATParams(int RMATNodes, int RMATEdges, double RMATAlpha, double RMATBeta, double RMATGamma) {
        this.RMATEdges = RMATEdges;
        this.RMATNodes = RMATNodes;
        this.RMATAlpha = RMATAlpha;
        this.RMATBeta = RMATBeta;
        this.RMATGamma = RMATGamma;
    }

    public void setRMATParamsTwo(int RMATNodes, int RMATEdges, double RMATAlpha, double RMATBeta, double RMATGamma) {
        this.RMATEdgesTwo = RMATEdges;
        this.RMATNodesTwo = RMATNodes;
        this.RMATAlphaTwo = RMATAlpha;
        this.RMATBetaTwo = RMATBeta;
        this.RMATGammaTwo = RMATGamma;
    }

    ConcurrentLinkedQueue<Double> resList;

    public void doDualGraphTest(int amount) {
        double avg = 0.0;
        double max = 0.0;
        double min = 1.0;

        resList = new ConcurrentLinkedQueue<>();
        var resArrayList = new ArrayList<Double>();
        var executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        var work = new ArrayList<Future<?>>();


        for (int i = 0; i < amount; i++) {
            var x = executor.submit(this::doCalcRun);
            work.add(x);
        }
        for (int i = 0; i < amount; i++) {
            try{
                work.get(i).get();
            } catch (Exception ignored) {}
            var oneRes = resList.poll();
            avg += oneRes;
            if (oneRes > max) max = oneRes;
            if (oneRes < min) min = oneRes;
            resArrayList.add(oneRes);
        }
        avg = avg / (double) amount;
        double variance = calcVariance(resArrayList, avg);
        System.out.println("Max: " + max + "\nMin: " + min + "\navg: " + avg + "\nVar: " + variance);
        executor.shutdown();
    }

    private void doCalcRun() {
        var x = RMATGenerator.generate(RMATNodes, RMATEdges, RMATAlpha, RMATBeta, RMATGamma);
        var y = RMATGenerator.generate(RMATNodesTwo, RMATEdgesTwo, RMATAlphaTwo, RMATBetaTwo, RMATGammaTwo);
        Double[] meansOne = new Double[metrics.length];
        Double[] meansTwo = new Double[metrics.length];
        int j = 0;
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
        var res = 1 - DistanceMeasures.calculateDistance(meansOne, meansTwo, distanceMeasure);
        System.out.println(res);
        resList.add(res);
    }



    private Double calcVariance(List<Double> res, double avg) {
        double sum = 0;
        for (Double re : res) {
            sum += Math.pow(re - avg, 2);
        }
        return sum / (double) res.size();
    }
}


