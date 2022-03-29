package python;

import compare.GraphCompare;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import generators.GraphGeneratorMethod;
import tendancy.Tendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class temp {
    public static void main(String[] args) {
        GraphCompare test = new GraphCompare();
        test.setMetrics(new NodeMetric[]{NodeMetric.DEGREE_CENTRALITY});
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setPrintGEDScript(true);

        test.setGeneratorMethods(new GraphGeneratorMethod[]{GraphGeneratorMethod.COMPLETE, GraphGeneratorMethod.COMPLETE});
        var options = new ArrayList<Map<String, Object>>();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("amountNodes", 5);

        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("amountNodes", 25);

        options.add(firstGraph); options.add(secondGraph);
        test.setGeneratorOptions(options);
        test.doDualGraphTest(1);
    }



}
