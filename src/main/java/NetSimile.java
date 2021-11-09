import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;

import java.util.ArrayList;
import java.util.Arrays;

public class NetSimile {

    Graph<Integer, Integer> graphOne;
    Graph<Integer, Integer> graphTwo;

    public NetSimile(Graph<Integer, Integer> graphOne, Graph<Integer, Integer> graphTwo) {
        this.graphOne = graphOne;
        this.graphTwo = graphTwo;
    }

    public void doNetSimile() {
        var res = aggregator(getFeatures());
        Arrays.stream(res)
                .forEach(System.out::println);
    }

    private ArrayList<Number>[] getFeatures() {
        ArrayList<Number> betweennessOne = new ArrayList<>();
        ArrayList<Number> betweennessTwo = new ArrayList<>();

        for(Integer x : graphOne.nodes()) {
            betweennessOne.add(MetricsCalculation.calculateNodeMetric(graphOne, x, NodeMetric.BETWEENNESS_CENTRALITY));
        }
        for(Integer x : graphTwo.nodes()) {
            betweennessTwo.add(MetricsCalculation.calculateNodeMetric(graphTwo, x, NodeMetric.BETWEENNESS_CENTRALITY));
        }
        return new ArrayList[]{betweennessOne, betweennessTwo};
    }

    private Number[] aggregator(ArrayList<Number>[] features) {
        Number[] result = new Number[features.length];
        int i = 0;
        for(var x : features) {
            Number agg = x.stream()
                    .reduce(0, (subtotal, element ) -> subtotal.doubleValue() + element.doubleValue());
            result[i++] = agg.doubleValue() / x.size();
        }
        return result;
    }
}
