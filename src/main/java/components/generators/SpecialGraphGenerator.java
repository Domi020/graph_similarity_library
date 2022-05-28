package components.generators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import org.apache.commons.math3.util.Pair;

import java.util.List;
import java.util.Objects;

public class SpecialGraphGenerator {

    public static Graph<Integer, Integer> generateCompleteGraph(int amountNodes) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        int i = 0;
        while(i < amountNodes) {
            graph.addNode(i);
            i++;
        }
        for(Integer x : graph.nodes()) {
            for(Integer y : graph.nodes()) {
                if(!Objects.equals(x, y) && !graph.containsEdge(x,y)) {
                    graph.addEdge(x,y,1);
                }
            }
        }
        return graph;
    }

    public static Graph<Integer, Integer> generateGraphWithoutEdges(int amountNodes) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        int i = 0;
        while(i < amountNodes) {
            graph.addNode(i);
            i++;
        }
        return graph;
    }

    public static Graph<Integer, Integer> generateStarGraph(int amountNodes) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        graph.addNode(0);
        for (int i = 1; i<amountNodes; i++) {
            graph.addNode(i);
            graph.addEdge(i, 0, 1);
        }
        return graph;
    }

    public static Graph<Integer, Integer> generateUniqueGraph(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        for (var node : nodes) {
            graph.addNode(node);
        }
        for (var edge : edges) {
            graph.addEdge(edge.getFirst(), edge.getSecond(), 1);
        }
        return graph;
    }
}
