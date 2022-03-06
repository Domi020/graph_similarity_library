import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import tendancy.Tendency;

public class Closeness_Degree_Main {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase6_degree_veryDifferent();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase18_perf_degree_heavy() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,8000,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,8000,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase17_perf_degree_medium() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,800,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,800,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase16_perf_degree_light() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,80,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,80,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase15_perf_closeness_heavy() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,8000,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,8000,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase14_perf_closeness_medium() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,800,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,800,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase13_perf_closeness_light() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,80,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,80,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase12_diffNodes_degree_diffEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);

        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,50,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase11_diffNodes_degree_sameEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,806,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase10_diffNodes_closeness_diffEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,50,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase9_diffNodes_closeness_sameEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,806,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase8_diffNodes_degree_closeness_diffEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,50,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase7_diffNodes_degree_closeness_sameEdges() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(8,13056,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,806,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase6_degree_veryDifferent() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,203,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase5_degree_same() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,3251,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4_closeness_veryDifferent() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,203,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase3_closeness_same() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,3251,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase2_edgesVeryDifferent() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,203,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase1_sameRMAT() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,3251,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }
}
