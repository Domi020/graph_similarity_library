package performance;

import dhbw.graphmetrics.metrics.NodeMetric;
import components.distance.DistanceMeasure;
import components.generators.GraphGeneratorMethod;
import components.tendency.Tendency;
import components.compare.GraphCompare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DegreePerformanceMain {

    public static void main(String[] args) {
        //nodePerformanceTest();
        edgePerformanceTest();
    }


    public static void nodePerformanceTest() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);
        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});

        int i = 0;
        while (i <= 8000) {
            var options = new ArrayList<Map<String, Object>>();
            var firstGraph = new HashMap<String, Object>();
            firstGraph.put("k", 7); firstGraph.put("M", i); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
            firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
            var secondGraph = new HashMap<String, Object>();
            secondGraph.put("k", 3); secondGraph.put("M", 5); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
            secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
            options.add(firstGraph); options.add(secondGraph);
            test.setGeneratorOptions(options);
            System.out.println("Kanten: " + i);
            test.doDualGraphTest(1000);
            if (i < 1000) i += 100; else i += 500;
        }
    }

    public static void edgePerformanceTest() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setGenerateGraphVisualizationScript(false);
        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT,
                GraphGeneratorMethod.RMAT});

        int i = 0;
        while (i <= 500) {
            var options = new ArrayList<Map<String, Object>>();
            var firstGraph = new HashMap<String, Object>();
            firstGraph.put("nodes", i); firstGraph.put("edgesPerIteration", 5);
            var secondGraph = new HashMap<String, Object>();
            secondGraph.put("k", 3); secondGraph.put("M", 5); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
            secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
            options.add(firstGraph); options.add(secondGraph);
            test.setGeneratorOptions(options);
            System.out.println("Kanten: " + i);
            test.doDualGraphTest(i < 150 ? 1000 : 100);
            if (i < 100) i += 10; else i += 20;
        }
    }
}
