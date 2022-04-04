package util;

import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import org.w3c.dom.Node;

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

    private static Double getMaximum(int nodes, NodeMetric metric) {
        switch (metric) {
            case DEGREE_CENTRALITY -> {return (double) (nodes - 1);}
            default -> {return 1.0;}
        }
    }

    private static Double getMinimum(int nodes, NodeMetric metric) {
        return 0.0;
    }

    public static Double normalizeDistanceMeasure(double value, DistanceMeasure distanceMeasure,
                                                  NodeMetric[] metrics, int nodes) {
        /*
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
            */
        Double[] maxDistances = new Double[metrics.length];
        Double[] minDistances = new Double[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            maxDistances[i] = getMaximum(nodes, metrics[i]);
            minDistances[i] = getMinimum(nodes, metrics[i]);
        }
        double maxDistance = DistanceMeasures.calculateDistance(maxDistances, minDistances, distanceMeasure);
        return (value / maxDistance);
    }

    public static Double[] normalizeNodeMetricArray(Double[] values, int nodeNumber, NodeMetric metric) {
        Double[] newValues = new Double[values.length];
        for(int i = 0; i<values.length; i++) {
            newValues[i] = normalizeNodeMetric(values[i], nodeNumber, metric);
        }
        return newValues;
    }
}
