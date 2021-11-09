package distance;

import java.util.Vector;

public class DistanceMeasures {

    public static double CanberraDistance(Double[] graphOne, Double[] graphTwo) {
        double sum = 0.0;
        for (int i = 0; i<graphOne.length; i++) {
            sum += Math.abs(graphOne[i] - graphTwo[i]) / (Math.abs(graphOne[i]) + Math.abs(graphTwo[i]));
        }
        return sum;
    }
}
