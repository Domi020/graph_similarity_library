import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.tendency.Tendency;

public class Betweenness_Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase21();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase21() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,2000,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,2000,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase20() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,800,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,800,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase19() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,500,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,500,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase18() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,500,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,500,0.2,0.2,0.3);
        test.doDualGraphTest(5);
    }

    public static void testcase17() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,1000,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,1000,0.2,0.2,0.3);
        test.doDualGraphTest(5);
    }

    public static void testcase16() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,100,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,100,0.2,0.2,0.3);
        test.doDualGraphTest(100);
    }

    public static void testcase15() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,10,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,10,0.2,0.2,0.3);
        test.doDualGraphTest(100);
    }

    public static void testcase14() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,1000,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,1000,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase13() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,100,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,100,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase12() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,10,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,10,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase11() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,1000,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,1000,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase10() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,100,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,100,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase9() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,10,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,10,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase8() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(6,298,0.2,0.2,0.3);
        test.setRMATParamsTwo(6,298,0.2,0.2,0.3);
        test.doDualGraphTest(10);
    }

    public static void testcase7() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(5,298,0.2,0.2,0.3);
        test.setRMATParamsTwo(5,298,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase6() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(4,72,0.2,0.2,0.3);
        test.setRMATParamsTwo(4,72,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase5() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(2,4,0.2,0.2,0.3);
        test.setRMATParamsTwo(2,4,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(2,4,0.2,0.2,0.3);
        test.setRMATParamsTwo(2,4,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase3() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(3,17,0.2,0.2,0.3);
        test.setRMATParamsTwo(3,17,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase2() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(4,108,0.2,0.2,0.3);
        test.setRMATParamsTwo(4,108,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase1() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(4,48,0.2,0.2,0.3);
        test.setRMATParamsTwo(4,48,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }
}
