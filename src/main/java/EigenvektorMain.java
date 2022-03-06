import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import tendancy.Tendency;

public class EigenvektorMain {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase4();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase4() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,50,0.2,0.2,0.3);
        test.doDualGraphTest(100);
    }

    public static void testcase3() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,806,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase2() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,203,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase1() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,3251,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }
}
