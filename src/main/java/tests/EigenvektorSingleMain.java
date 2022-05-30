package tests;

import components.compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.generators.GraphGeneratorMethod;
import org.apache.commons.math3.util.Pair;
import components.tendency.Tendency;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EigenvektorSingleMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> thisClass = Class.forName("tests.EigenvektorSingleMain");

        for (int i = 1; i<=12; i++) {
            Method method = thisClass.getMethod("EC" + i);
            long startTime = System.nanoTime();
            method.invoke(null);
            long stopTime = System.nanoTime();
            System.out.println("Time: " + ((stopTime - startTime) / 1000000));
        }
    }

    public static void EC9() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 13056); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 50); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void EC8() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 13056); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 806); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void EC7() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 200); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 1000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 1000); secondGraph.put("alpha", 0.03); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.9); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 1000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 1000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC4() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.COMPLETE, GraphGeneratorMethod.WITHOUT_EDGES});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("amountNodes", 128);

        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("amountNodes", 128);

        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC3() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.UNIQUE, GraphGeneratorMethod.UNIQUE});
        var options = new ArrayList<Map<String, Object>>();
        List<Integer> nodes = new ArrayList<>();
        nodes.add(0);nodes.add(1);nodes.add(2);nodes.add(3);nodes.add(4);nodes.add(5);nodes.add(6);nodes.add(7);
        List<Pair<Integer, Integer>> edges = new ArrayList<>();
        edges.add(new Pair<>(0,1));edges.add(new Pair<>(0,3));edges.add(new Pair<>(0,5));
        edges.add(new Pair<>(0,6));edges.add(new Pair<>(1,2));edges.add(new Pair<>(1,3));
        edges.add(new Pair<>(1,7));edges.add(new Pair<>(2,6));edges.add(new Pair<>(2,7));
        edges.add(new Pair<>(3,4));edges.add(new Pair<>(3,5));edges.add(new Pair<>(3,7));
        edges.add(new Pair<>(4,5));edges.add(new Pair<>(4,6));edges.add(new Pair<>(4,7));
        edges.add(new Pair<>(5,6));edges.add(new Pair<>(5,7));edges.add(new Pair<>(6,7));
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("nodes", nodes); firstGraph.put("edges", edges);

        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", nodes); secondGraph.put("edges", edges);

        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 203); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void EC1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

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
        test.doDualGraphTest(100);
    }
}
