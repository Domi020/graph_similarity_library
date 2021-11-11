package generators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;

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
}
