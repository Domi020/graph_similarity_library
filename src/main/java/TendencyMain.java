import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import tendancy.Tendency;

public class TendencyMain {

    public static void main(String[] args) {
        testcase6_closeness_manhattan_slightlydiff();
    }

    public static void testcase6_closeness_manhattan_slightlydiff() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTestWOTendancy(1000);
    }

    public static void testcase5_closeness_manhattan_slightlydiff_median() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4_closeness_manhattan_slightlydiff_modus() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MODUS);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase3_closeness_manhattan_slightlydiff_harmonic() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase2_closeness_manhattan_slightlydiff_geom() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase1_closeness_manhattan_slightlydiff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }
}
