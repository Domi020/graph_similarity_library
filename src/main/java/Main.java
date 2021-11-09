import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.graph.persistence.GraphPersistence;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import generators.RMATGenerator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Graph<Integer, Integer> graph = buildGraph();
        //Number x = MetricsCalculation.calculateNodeMetric(graph, 2, NodeMetric.BETWEENNESS_CENTRALITY);
        //System.out.println(x);
        //NetSimile simile = new NetSimile(graph, graph);
        //simile.doNetSimile();
        RMATGenerator.generate();
        var x = RMATGenerator.generateGraphFromMatrix();
        /*
        try{
            GraphPersistence.persistGraph(x, null, null);
        }catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    public static Graph<Integer, Integer> buildGraph() {
        //Link: http://graphonline.ru/de/?graph=RfvDANvTjINwecRh
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);
        graph.addNode(7);
        graph.addNode(8);
        graph.addNode(9);

        graph.addEdge(0, 3, 1);
        graph.addEdge(0, 4, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 4, 1);
        graph.addEdge(1, 8, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 1);
        graph.addEdge(2, 9, 1);
        graph.addEdge(4, 7, 1);
        graph.addEdge(5, 9, 1);
        graph.addEdge(6, 7, 1);
        graph.addEdge(7, 8, 1);

        return graph;
    }
}
