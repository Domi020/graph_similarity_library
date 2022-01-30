package SpecialTest;

import dhbw.graphmetrics.graph.AdjacencyListGraph;
import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.NodeToNodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import org.junit.Assert;
import org.junit.Test;

public class BoundaryClosenessDist {

    @Test
    public void max_of_closeness() {
        Graph<Integer, Integer> graphOne = new SimpleUndirectedAdjacencyListGraph<>();
        graphOne.addNode(1);
        graphOne.addNode(2);
        graphOne.addNode(3);
        graphOne.addNode(4);
        //graphOne.addEdge(1, 1, 1);
        graphOne.addEdge(1, 2, 1);
        graphOne.addEdge(1, 3, 1);
        graphOne.addEdge(1, 4, 1);

        var z = MetricsCalculation.calculateNodeMetric(graphOne, 1, NodeMetric.CLOSENESS_CENTRALITY);
        Assert.assertEquals(1.0, z);
    }

    @Test
    public void min_of_closeness() {
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
