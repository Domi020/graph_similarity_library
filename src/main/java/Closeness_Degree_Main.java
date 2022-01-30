import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import tendancy.Tendency;

public class Closeness_Degree_Main {

    public static void main(String[] args) {
        testcase2_edgesVeryDifferent();
    }

    public static void testcase2_edgesVeryDifferent() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,203,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase1_sameRMAT() {
        MultipleMetricCompare test = new MultipleMetricCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,3251,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }
}
