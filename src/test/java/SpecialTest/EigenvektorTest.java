package SpecialTest;

import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import org.junit.jupiter.api.Test;

public class EigenvektorTest {

    @Test
    public void test() {
        var graph = new SimpleUndirectedAdjacencyListGraph<Integer, Integer>();

        graph.addNode(1);graph.addNode(2);graph.addNode(3);graph.addNode(4);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,1);
        graph.addEdge(2,3,1);
        graph.addEdge(2,4,1);

        /*
        System.out.println(MetricsCalculation.calculateNodeMetric(graph, 1, NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED));
        System.out.println(MetricsCalculation.calculateNodeMetric(graph, 2, NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED));
        System.out.println(MetricsCalculation.calculateNodeMetric(graph, 3, NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED));
        System.out.println(MetricsCalculation.calculateNodeMetric(graph, 4, NodeMetric.EIGENVECTOR_CENTRALITY_NORMALIZED));
*/

        Double[] one = new Double[2]; one[0] = 2.9; one[1] = 8232.0;
        Double[] two = new Double[2]; two[0] = 3.0; two[1] = 4116.0;
        System.out.println(DistanceMeasures.calculateDistance(one, two, DistanceMeasure.CANBERRA));
    }
}
