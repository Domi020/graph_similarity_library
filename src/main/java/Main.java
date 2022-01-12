import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import tendancy.Tendency;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        testcase12_closeness_manhattan_slightlydiff_mean();
    }

    public static void testcase12_closeness_manhattan_slightlydiff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.MANHATTAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase11_closeness_quadratic_slightlydiff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.QUADRATIC_EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase10_closeness_euclidean_slightlydiff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase9_closeness_canberra_slightlydiff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,1626,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase8_closeness_manhattan_diff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.MANHATTAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,406,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase7_closeness_quadratic_diff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.QUADRATIC_EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,406,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase6_closeness_euclidean_diff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,406,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase5_closeness_canberra_diff_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.setRMATParamsTwo(7,406,0.2,0.2,0.3);
        test.doDualGraphTest(1000);
    }

    public static void testcase4_closeness_manhattan_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.MANHATTAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.doSingleGraphTest(1000);
    }

    public static void testcase3_closeness_quadratic_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.QUADRATIC_EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.doSingleGraphTest(1000);
    }

    public static void testcase1_closeness_canberra_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.CANBERRA);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.doSingleGraphTest(1000);
    }

    public static void testcase2_closeness_euclidean_mean() {
        MetricCompareTest test = new MetricCompareTest();
        test.setMetric(NodeMetric.CLOSENESS_CENTRALITY);
        test.setDistanceMeasure(DistanceMeasure.EUCLIDEAN);
        test.setTendency(Tendency.MEAN);
        test.setRMATParams(7,3251,0.2,0.2,0.3);
        test.doSingleGraphTest(1000);
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
