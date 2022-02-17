package SpecialTest;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeToNodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DistancesTest {
    @Test
    public void distanceForNotConnectedNodes() {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addAllNodes(Arrays.asList(1,2,3,4,5));
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,1);
        graph.addEdge(3,4,1);

        Number x = MetricsCalculation.calculateNodeToNodeMetric(graph, 5, 1, NodeToNodeMetric.DISTANCE);

        Assert.assertEquals(0, x);
    }
}
