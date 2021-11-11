package MetricCalculators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;

import java.util.ArrayList;
import java.util.Arrays;

public class CentralityCalculator {

    public static Double[] calculateCentrality(NodeMetric metric, Graph<Integer, Integer> graph) {
        ArrayList<Double> values = new ArrayList<>();
        for (Integer x : graph.nodes()) {
            var z = MetricsCalculation.calculateNodeMetric(graph, x, metric);
            values.add(z.doubleValue());
        }
        return values.toArray(new Double[0]);
    }
}
