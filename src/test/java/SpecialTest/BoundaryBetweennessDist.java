package SpecialTest;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.NodeToNodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import org.junit.Assert;
import org.junit.Test;

public class BoundaryBetweennessDist {
    @Test
    public void max_of_betweenness() {
        Graph<Integer, Integer> graphOne = new SimpleUndirectedAdjacencyListGraph<>();
        graphOne.addNode(1);
        graphOne.addNode(2);
        graphOne.addNode(3);
        graphOne.addNode(4);
        graphOne.addNode(5);
        graphOne.addNode(6);
        graphOne.addNode(7);
        graphOne.addEdge(1, 2, 1);
        graphOne.addEdge(2, 3, 1);
        graphOne.addEdge(2, 4, 1);
        graphOne.addEdge(2, 5, 1);
        graphOne.addEdge(2, 6, 1);
        graphOne.addEdge(2, 7, 1);

        var z = MetricsCalculation.calculateNodeMetric(graphOne, 2, NodeMetric.BETWEENNESS_CENTRALITY);
        Assert.assertEquals(30.0, z);
    }

    @Test
    public void min_of_betweenness() {
        Graph<Integer, Integer> graphOne = new SimpleUndirectedAdjacencyListGraph<>();
        graphOne.addNode(1);
        graphOne.addNode(2);
        graphOne.addNode(3);
        graphOne.addNode(4);
        graphOne.addEdge(1, 2, 1);
        graphOne.addEdge(1, 3, 1);

        var x = MetricsCalculation.calculateNodeToNodeMetric(graphOne, 1, 4, NodeToNodeMetric.DISTANCE);

        double z = (double) MetricsCalculation.calculateNodeMetric(graphOne, 4, NodeMetric.CLOSENESS_CENTRALITY);
        Assert.assertEquals(0.0, z, 0.003);
    }
}
