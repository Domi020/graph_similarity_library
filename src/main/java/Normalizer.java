import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;

public class Normalizer {
    public static double normalizeNodeMetric(double value, int nodeNumber, NodeMetric metric) {
        switch (metric) {
            case BETWEENNESS_CENTRALITY -> {
                double max = ((double) (nodeNumber - 1) * (nodeNumber - 2)) / 2.0;
                return value / max;
            }
            case DEGREE_CENTRALITY -> {
                double max = (double) nodeNumber - 1;
                return value / max;
            }
            case CLOSENESS_CENTRALITY_DISCONNECTED -> {
                double max = (1.0 / (double) (nodeNumber - 1));
                return value /max;
            }
            default -> {
                return value;
            }
        }
    }

    public static Double normalizeDistanceMeasure(double value, int numberOfMetrics, DistanceMeasure distanceMeasure) {
        switch (distanceMeasure) {
            case EUCLIDEAN -> {
                return value / Math.sqrt(numberOfMetrics);
            }
            case CANBERRA -> {
                return value / numberOfMetrics;
            }
            default -> {
                return value;
            }
        }
    }

    public static Double[] normalizeNodeMetricArray(Double[] values, int nodeNumber, NodeMetric metric) {
        Double[] newValues = new Double[values.length];
        for(int i = 0; i<values.length; i++) {
            newValues[i] = normalizeNodeMetric(values[i], nodeNumber, metric);
        }
        return newValues;
    }
}
