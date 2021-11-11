import MetricCalculators.CentralityCalculator;
import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasures;
import generators.RMATGenerator;
import generators.SpecialGraphGenerator;
import tendancy.CentralTendencies;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        //Graph<Integer, Integer> graph = buildGraph();
        //Number x = MetricsCalculation.calculateNodeMetric(graph, 2, NodeMetric.BETWEENNESS_CENTRALITY);
        //System.out.println(x);
        //NetSimile simile = new NetSimile(graph, graph);
        //simile.doNetSimile();
        double max = 0.0;
        double min = 1.0;
        double avg = 0.0;

        for(int i = 0; i < 1000; i++) {
            RMATGenerator.generate(5, 180, 0.2, 0.2, 0.3);
            var x = RMATGenerator.generateGraphFromMatrix();
            RMATGenerator.generate(5, 50, 0.2, 0.2, 0.3);
            var y = RMATGenerator.generateGraphFromMatrix();
            var closenessValuesOne = CentralityCalculator.calculateCentrality(NodeMetric.DEGREE_CENTRALITY, x);
            var closenessValuesTwo = CentralityCalculator.calculateCentrality(NodeMetric.DEGREE_CENTRALITY, y);
            var meanOne = CentralTendencies.arithmeticMean(closenessValuesOne);
            var meanTwo = CentralTendencies.arithmeticMean(closenessValuesTwo);
            var res = 1 - DistanceMeasures.CanberraDistance(meanOne, meanTwo);
            if (res > max) max = res;
            if (res < min) min = res;
            avg += res;
            System.out.println(res);
           // System.out.println();
        }
        avg = avg / 1000.0;
        System.out.println("Max: " + max + "\nMin: "+ min + "\navg: "+ avg);

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

    static void shuffleArray(Double[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            double a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
