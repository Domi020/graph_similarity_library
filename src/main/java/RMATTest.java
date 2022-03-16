import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import generators.GraphGeneratorMethod;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RMATTest {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        testcase1();

        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime));
    }

    public static void testcase1() {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED, NodeMetric.DEGREE_CENTRALITY,
                NodeMetric.EIGENVECTOR_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.RMAT, GraphGeneratorMethod.RMAT});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 7); firstGraph.put("M", 1000); firstGraph.put("alpha", 0.9); firstGraph.put("beta", 0.03);
        firstGraph.put("gamma", 0.03); firstGraph.put("duplicates", false);
        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("k", 7); secondGraph.put("M", 1000); secondGraph.put("alpha", 0.02); secondGraph.put("beta", 0.02);
        secondGraph.put("gamma", 0.01); secondGraph.put("duplicates", false);
        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(10);
    }
}
