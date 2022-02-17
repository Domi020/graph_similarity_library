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
            if(metric == NodeMetric.CLOSENESS_CENTRALITY && z.doubleValue() < 0) {
                z = 0;
            }
            values.add(z.doubleValue());
        }
        return values.toArray(new Double[0]);
    }
    /*

    Closeness Centrality
        * Distanz zwischen zwei Knoten
        * Knotenzahl im Graph

        Max: 1
        Min: 0

    Betweenness Centrality
        * (indirekt) Distanzen
        * Anzahl kürzeste Wege

        Max: (n-1) * (n-2) / 2 [n = Anzahl Knoten]
        Min: 0


     Degree Centrality
        * Gradzahl

        Max: (n-1)
        Min: 0
     */



}
