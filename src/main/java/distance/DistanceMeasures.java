package distance;

import java.util.Vector;

public class DistanceMeasures {

    public static double calculateDistance(Double graphOne, Double graphTwo, DistanceMeasure measure) {
        if(measure == DistanceMeasure.CANBERRA) {
            return CanberraDistance(graphOne, graphTwo);
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
}
