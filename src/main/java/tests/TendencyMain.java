package tests;

import components.compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.generators.GraphGeneratorMethod;
import components.tendency.Tendency;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TendencyMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> thisClass = Class.forName("tests.TendencyMain");

        for (int i = 1; i<=12; i++) {
            //System.out.println("TESTCASE " + i);
            Method method = thisClass.getMethod("TenD" + i);
            long startTime = System.nanoTime();
            method.invoke(null);
            long stopTime = System.nanoTime();
            System.out.println("Time: " + (stopTime - startTime));
        }
    }

    public static void TenC12() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC11() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC10() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC9() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC8() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC7() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenC4() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
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

    public static void TenC3() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
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



    public static void TenC2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
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

    public static void TenC1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
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


    public static void TenD12() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD11() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD10() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD9() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 2000); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 2000); secondGraph.put("alpha", 0.9); secondGraph.put("beta", 0.03);
        secondGraph.put("gamma", 0.03); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD8() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEDIAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD7() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD6() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD5() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 3251); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 406); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
        secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(100);
    }

    public static void TenD4() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
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

    public static void TenD3() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.HARMONIC);
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



    public static void TenD2() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.GEOMETRIC);
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

    public static void TenD1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
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
