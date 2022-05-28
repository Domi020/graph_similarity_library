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

public class DegreeAndClosenessMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> thisClass = Class.forName("DegreeAndClosenessMain");

        for (int i = 1; i<=18; i++) {
            //System.out.println("TESTCASE " + i);
            Method method = thisClass.getMethod("DaC" + i);
            long startTime = System.nanoTime();
            method.invoke(null);
            long stopTime = System.nanoTime();
            //System.out.println("Time: " + ((stopTime - startTime) / 1000000));
            System.out.print(((stopTime - startTime) / 1000000) + " \\\\ \\hline\n");
        }
    }
    public static void DaC18() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 4); firstGraph.put("M", 120); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 4); secondGraph.put("M", 30); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void DaC17() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 4); firstGraph.put("M", 120); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 4); secondGraph.put("M", 120); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void DaC16() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 10); firstGraph.put("M", 90000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 10); secondGraph.put("M", 6000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void DaC15() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 10); firstGraph.put("M", 60000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 10); secondGraph.put("M", 60000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void DaC14() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 10); firstGraph.put("M", 8000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 10); secondGraph.put("M", 8000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void DaC13() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 10); firstGraph.put("M", 60000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 10); secondGraph.put("M", 60000); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }

    public static void DaC12() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 326); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 50); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void DaC11() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 326); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 806); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void DaC10() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 8); firstGraph.put("M", 3264); firstGraph.put("alpha", 0.9); firstGraph.put("beta", 0.03);
        firstGraph.put("gamma", 0.03); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 6); secondGraph.put("M", 202); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void DaC9() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(100);
    }

    public static void DaC8() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(100);
    }

    public static void DaC7() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(1000);
    }

    public static void DaC6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(1000);
    }

    public static void DaC5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(1000);
    }

    public static void DaC4() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.COMPLETE, GraphGeneratorMethod.WITHOUT_EDGES});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("amountNodes", 128);

        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("amountNodes", 128);

        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1000);
    }

    public static void DaC3() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(1000);
    }

    public static void DaC2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
        test.setPrintGEDScript(false);

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
        test.doDualGraphTest(1000);
    }

    public static void DaC1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY, NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendencies(new Tendency[]{Tendency.GEOMETRIC, Tendency.GEOMETRIC});
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
