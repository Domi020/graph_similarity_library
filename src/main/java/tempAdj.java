import distance.DistanceMeasure;
import distance.DistanceMeasures;

public class tempAdj {

    public static void main(String[] args) {
        Double[] arrayOne = new Double[] {2.765, 1.239, 0.326, 0.0,-1.0, -1.375, -1.955 };
        Double[] arrayTwo = new Double[] {2.594, 0.916, 0.0, 0.0, 0.0, -1.388, -2.122 };

        System.out.println(DistanceMeasures.calculateDistance(arrayOne, arrayTwo, DistanceMeasure.EUCLIDEAN));
    }
}
