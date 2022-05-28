package components.MetricCalculators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;

import java.util.ArrayList;

/**
 * Connector class to metric library
 */
public class CentralityCalculator {

    public static Double[] calculateCentrality(NodeMetric metric, Graph<Integer, Integer> graph) {
        ArrayList<Double> values = new ArrayList<>();
        for (Integer x : graph.nodes()) {
            var z = MetricsCalculation.calculateNodeMetric(graph, x, metric);
            if(metric == NodeMetric.CLOSENESS_CENTRALITY && z.doubleValue() < 0) {
                z = 0;
            }
            values.add(z.doubleValue());
        }
        return values.toArray(new Double[0]);
    }
}
