package performance;

import compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import generators.GraphGeneratorMethod;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BetweennessPerformanceMain {
    public static void main(String[] args) {
        //nodePerformanceTest();
        edgePerformanceTest();
    }


    public static void nodePerformanceTest() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);
        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});

        int i = 0;
        while (i <= 400) {
            var options = new ArrayList<Map<String, Object>>();
            var firstGraph = new HashMap<String, Object>();
            firstGraph.put("k", 5); firstGraph.put("M", i); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
            firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
            var secondGraph = new HashMap<String, Object>();
            secondGraph.put("k", 3); secondGraph.put("M", 5); secondGraph.put("alpha", 0.2); secondGraph.put("beta", 0.2);
            secondGraph.put("gamma", 0.3); secondGraph.put("mode", "onlyBelow");
            options.add(firstGraph); options.add(secondGraph);
            test.setGeneratorOptions(options);
            System.out.println("Kanten: " + i);
            if (i < 100) test.doDualGraphTest(10);
            else test.doDualGraphTest(10);
            if (i < 100) i += 10; else i += 50;
        }
    }

    public static void edgePerformanceTest() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.BETWEENNESS_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(false);
        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.BARABASI_ALBERT,
                GraphGeneratorMethod.RMAT});

        int i = 0;
        while (i <= 80) {
            var options = new ArrayList<Map<String, Object>>();
            var firstGraph = new HashMap<String, Object>();
            firstGraph.put("nodes", i);
            firstGraph.put("edgesPerIteration", 5);
            var secondGraph = new HashMap<String, Object>();
            secondGraph.put("k", 3);
            secondGraph.put("M", 5);
            secondGraph.put("alpha", 0.2);
            secondGraph.put("beta", 0.2);
            secondGraph.put("gamma", 0.3);
            secondGraph.put("mode", "onlyBelow");
            options.add(firstGraph);
            options.add(secondGraph);
            test.setGeneratorOptions(options);
            System.out.println("Kanten: " + i);
            test.doDualGraphTest(10);
            i += 5;
        }
    }
}
