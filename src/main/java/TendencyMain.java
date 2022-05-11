import compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import generators.GraphGeneratorMethod;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TendencyMain {

    public static void main(String[] args) {
        //testcase2_closeness_manhattan_slightlydiff_geom();
        //testcase3_closeness_manhattan_slightlydiff_harmonic();
        //testcase4_closeness_manhattan_slightlydiff_modus();
        //testcase5_closeness_manhattan_slightlydiff_median();
        //testcase6_closeness_manhattan_slightlydiff();
    }

    public static void testcase6_closeness_manhattan_slightlydiff() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.DEGREE_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTestWOTendancy(1000);
    }

    public static void testcase5_closeness_manhattan_slightlydiff_median() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.DEGREE_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4_closeness_manhattan_slightlydiff_modus() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.DEGREE_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MODUS);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase3_closeness_manhattan_slightlydiff_harmonic() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.DEGREE_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 3251); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 3251); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }
}
