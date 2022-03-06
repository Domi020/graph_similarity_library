import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import org.junit.Assert;
import org.junit.Test;
import python.PythonGraphGenerator;

import java.io.File;
import java.util.Arrays;

public class PythonTest {

    @Test
    public void generateGraphString_generateCorrectGraphString() {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addAllNodes(Arrays.asList(1,2,3,4,5));
        graph.addEdge(2,5, 1);
        graph.addEdge(1,4, 1);
        graph.addEdge(5,1, 1);
        graph.addEdge(2,3, 1);
        graph.addEdge(3,4, 1);

        var graphString = PythonGraphGenerator.generateGraphString(graph, "G");

        Assert.assertEquals(1 + 5 + 10, graphString.lines().count());
        Assert.assertTrue(graphString.contains("G.add_node(1)"));
        Assert.assertTrue(graphString.contains("G.add_node(4)"));
        Assert.assertTrue(graphString.contains("G.add_edge(1, 4)"));
        Assert.assertTrue(graphString.contains("G.add_edge(2, 5)"));
        Assert.assertTrue(graphString.contains("G.add_edge(5, 1)"));
        Assert.assertTrue(graphString.contains("G.add_edge(2, 3)"));
        Assert.assertTrue(graphString.contains("G.add_edge(3, 4)"));
    }

    @Test
    public void generateGEDTest_generateCorrectString() {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addAllNodes(Arrays.asList(1,2,3,4,5));
        graph.addEdge(2,5, 1);
        graph.addEdge(1,4, 1);
        graph.addEdge(5,1, 1);
        graph.addEdge(2,3, 1);
        graph.addEdge(3,4, 1);

        var gedString = PythonGraphGenerator.generateGEDTest(graph, graph, false);

        Assert.assertTrue(gedString.contains("import networkx as nx"));
//        Assert.assertTrue(gedString.contains("nx.graph_edit_distance(G1, G2)"));
    }

    @Test
    public void generateGEDTest_generateFile() {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addAllNodes(Arrays.asList(1,2,3,4,5));
        graph.addEdge(2,5, 1);
        graph.addEdge(1,4, 1);
        graph.addEdge(5,1, 1);
        graph.addEdge(2,3, 1);
        graph.addEdge(3,4, 1);

        Graph<Integer, Integer> graphT = new SimpleUndirectedAdjacencyListGraph<>();
        graphT.addAllNodes(Arrays.asList(1,2,3,4,5));
        graphT.addEdge(2,5, 1);
        graphT.addEdge(1,4, 1);
        graphT.addEdge(5,1, 1);
        graphT.addEdge(2,3, 1);

        var gedString = PythonGraphGenerator.generateGEDTest(graph, graphT, true);
    }
}
