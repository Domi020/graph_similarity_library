import components.compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.generators.GraphGeneratorMethod;
import components.tendency.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompCentralityMain {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        testcase18();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase18() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 3); firstGraph.put("M", 22); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 3); secondGraph.put("M", 8); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase17() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 3); firstGraph.put("M", 22); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 3); secondGraph.put("M", 22); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase16() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 13056); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 50); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void testcase15() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 13056); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 806); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase14() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 203); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase13() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 3251); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase12() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 500); firstGraph.put("edgesPerIteration", 30);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 500); secondGraph.put("edgesPerIteration", 30);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void testcase11() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 300); firstGraph.put("edgesPerIteration", 18);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 300); secondGraph.put("edgesPerIteration", 18);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void testcase10() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 200); firstGraph.put("edgesPerIteration", 12);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 200); secondGraph.put("edgesPerIteration", 12);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void testcase9() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 150); firstGraph.put("edgesPerIteration", 9);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 150); secondGraph.put("edgesPerIteration", 9);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase8() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 100); firstGraph.put("edgesPerIteration", 6);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 100); secondGraph.put("edgesPerIteration", 6);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase7() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT, GraphGeneratorMethod.BARABASI_ALBERT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", 50); firstGraph.put("edgesPerIteration", 3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 50); secondGraph.put("edgesPerIteration", 3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 5000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 5000); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void testcase5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void testcase4() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 200); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 200); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase3() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 8000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 8000); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 800); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 800); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void testcase1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
            NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 80); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 80); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }
}
