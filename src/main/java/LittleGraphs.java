import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.tendency.Tendency;

public class LittleGraphs {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase5();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase5() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setRMATParams(3,20,0.2,0.2,0.3);
        test.setRMATParamsTwo(3,20,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setBAParams(15, 2);
        test.setBAParamsTwo(15, 6);
        test.doDualGraphTest(1000);
    }

    public static void testcase3() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setBAParams(15, 2);
        test.setBAParamsTwo(15, 6);
        test.doDualGraphTest(1000);
    }

    public static void testcase2() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setBAParams(15, 2);
        test.setBAParamsTwo(15, 6);
        test.doDualGraphTest(1000);
    }

    public static void testcase1() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setBAParams(15, 6);
        test.setBAParamsTwo(15, 6);
        test.doDualGraphTest(1000);
    }


}
