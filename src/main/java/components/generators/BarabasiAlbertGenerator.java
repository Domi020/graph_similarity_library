package components.generators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.control.calculation.node.BasicNodeMetricCalculation;
import org.apache.commons.math3.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Implementation of BA graph generator
 */
public class BarabasiAlbertGenerator {

    public static Graph<Integer, Integer> generate(int nodes, int edgesPerIteration) {
        var graph = initGraph(edgesPerIteration);
        Random random = new Random();
        for(int i = 0; i<nodes - edgesPerIteration; i++) {
            //System.out.println(graph.edges().size());
            graph.addNode(i + edgesPerIteration);
            for(int j = 0; j<edgesPerIteration; j++) {
                double randomNumber = random.nextDouble();
                var distribution = calcDistribution(graph);
                for (int k = 0; k< distribution.size(); k++) {
                    if (randomNumber <= distribution.get(k).getSecond()) {
                        graph.addEdge(i + edgesPerIteration, distribution.get(k).getFirst().intValue(), 1);
                        break;
                    }
                }
            }
        }
        return graph;
    }

    private static Graph<Integer, Integer> initGraph(int nodes) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        for(int i = 0; i<nodes; i++) {
            graph.addNode(i);
            for(int j = 0; j<i; j++) {
                graph.addEdge(i, j, 1);
            }
        }
        return graph;
    }

    private static List<Pair<Double, Double>> calcDistribution(Graph<Integer, Integer> graph) {
        int sum = 0;
        int currentNode = graph.nodes().size() - 1;
        for (var node : graph.nodes()) {
            if(!graph.containsEdge(currentNode, node) && currentNode != node) {
                sum += BasicNodeMetricCalculation.degree(graph, node);
            }
        }
        List<Pair<Double, Double>> result = new ArrayList<>();
        int pos = 0;
        for(int i = 0; i<graph.nodes().size() - 1; i++) {
            if(!graph.containsEdge(currentNode, i) && currentNode != graph.findEqualNode(i)){
                double value;
                if(pos != 0) {
                    value = result.get(pos-1).getSecond() +
                            ((double) BasicNodeMetricCalculation.degree(graph, graph.findEqualNode(i)) / (double) sum);
                } else {
                    value = 0.0 +
                            ((double) BasicNodeMetricCalculation.degree(graph, graph.findEqualNode(i)) / (double) sum);
                }
                result.add(new Pair<>((double) i, value));
                pos++;
            }
        }
        return result;
    }
}
