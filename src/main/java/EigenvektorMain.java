import compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import generators.GraphGeneratorMethod;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EigenvektorMain {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase6();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.STAR, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("amountNodes", 8);
        var secondGraph = new HashMap<String, Object>();
        //var nodes = new ArrayList<Integer>();
        //nodes.add(1);nodes.add(2);nodes.add(3);nodes.add(4);nodes.add(5);nodes.add(6);
        //var edges = new ArrayList<Pair<Integer, Integer>>();
       // edges.add(new Pair<>(1,2));edges.add(new Pair<>(2,3));edges.add(new Pair<>(3,4));
      //  edges.add(new Pair<>(4,5));edges.add(new Pair<>(5,6));edges.add(new Pair<>(6,1));
        secondGraph.put("k", 3);
        secondGraph.put("M", 7);
        secondGraph.put("alpha", 0.2);
        secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.WITHOUT_EDGES, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("amountNodes", 16);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 4);
        secondGraph.put("M", 80);
        secondGraph.put("alpha", 0.2);
        secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
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
