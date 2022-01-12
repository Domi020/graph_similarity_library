package distance;

import java.util.Vector;

public class DistanceMeasures {

    public static double calculateDistance(Double graphOne, Double graphTwo, DistanceMeasure measure) {
        if(measure == DistanceMeasure.CANBERRA) {
            return CanberraDistance(graphOne, graphTwo);
        } else if(measure == DistanceMeasure.EUCLIDEAN) {
            return EuclideanDistance(graphOne, graphTwo);
        } else if(measure == DistanceMeasure.QUADRATIC_EUCLIDEAN) {
            return QuadraticEuclideanDistance(graphOne, graphTwo);
        } else if(measure == DistanceMeasure.MANHATTAN) {
            return ManhattanDistance(graphOne, graphTwo);
        }
        return 0.0;
    }

    public static double CanberraDistance(Double[] graphOne, Double[] graphTwo) {
        double sum = 0.0;
        for (int i = 0; i<graphOne.length; i++) {
            sum += Math.abs(graphOne[i] - graphTwo[i]) / (Math.abs(graphOne[i]) + Math.abs(graphTwo[i]));
        }
        return sum;
    }

    public static double CanberraDistance(Double graphOne, Double graphTwo) {
        return Math.abs(graphOne - graphTwo) / (Math.abs(graphOne) + Math.abs(graphTwo));
    }

    private static double EuclideanDistance(Double graphOne, Double graphTwo) {
        return Math.sqrt(Math.pow(graphOne - graphTwo, 2));
    }

    private static double QuadraticEuclideanDistance(Double graphOne, Double graphTwo) {
        return Math.pow(graphOne - graphTwo, 2);
    }

    private static double ManhattanDistance(Double graphOne, Double graphTwo) {
        return Math.abs(graphOne - graphTwo);
    }
}
