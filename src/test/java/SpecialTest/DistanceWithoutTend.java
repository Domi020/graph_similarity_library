package SpecialTest;

import distance.DistanceMeasure;
import distance.DistanceMeasures;
import org.junit.Assert;
import org.junit.Test;

public class DistanceWithoutTend {

     @Test
     public void order_important_euclid() {
         Double[] GraphOne = {4.5, 6.7, 3.1, 8.9};
         Double[] GraphTwo = {4.5, 6.7, 3.1, 8.9};

         var dist = DistanceMeasures.calculateDistance(GraphOne, GraphTwo, DistanceMeasure.EUCLIDEAN);
         Assert.assertEquals(0, dist, 0);

         Double[] GraphThree = {4.5, 6.7, 3.1, 8.9};
         Double[] GraphFour = {4.5, 3.1, 8.9, 6.7};

         var dist2 = DistanceMeasures.calculateDistance(GraphThree, GraphFour, DistanceMeasure.EUCLIDEAN);
         Assert.assertNotEquals(0, dist2, 0);
     }

    @Test
    public void order_important_manhattan() {
        Double[] GraphOne = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphTwo = {4.5, 6.7, 3.1, 8.9};

        var dist = DistanceMeasures.calculateDistance(GraphOne, GraphTwo, DistanceMeasure.MANHATTAN);
        Assert.assertEquals(0, dist, 0);

        Double[] GraphThree = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphFour = {4.5, 3.1, 8.9, 6.7};

        var dist2 = DistanceMeasures.calculateDistance(GraphThree, GraphFour, DistanceMeasure.MANHATTAN);
        Assert.assertNotEquals(0, dist2, 0);
    }

    @Test
    public void order_important_quadratic() {
        Double[] GraphOne = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphTwo = {4.5, 6.7, 3.1, 8.9};

        var dist = DistanceMeasures.calculateDistance(GraphOne, GraphTwo, DistanceMeasure.QUADRATIC_EUCLIDEAN);
        Assert.assertEquals(0, dist, 0);

        Double[] GraphThree = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphFour = {4.5, 3.1, 8.9, 6.7};

        var dist2 = DistanceMeasures.calculateDistance(GraphThree, GraphFour, DistanceMeasure.QUADRATIC_EUCLIDEAN);
        Assert.assertNotEquals(0, dist2, 0);
    }

    @Test
    public void order_important_canberra() {
        Double[] GraphOne = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphTwo = {4.5, 6.7, 3.1, 8.9};

        var dist = DistanceMeasures.calculateDistance(GraphOne, GraphTwo, DistanceMeasure.CANBERRA);
        Assert.assertEquals(0, dist, 0);

        Double[] GraphThree = {4.5, 6.7, 3.1, 8.9};
        Double[] GraphFour = {4.5, 3.1, 8.9, 6.7};

        var dist2 = DistanceMeasures.calculateDistance(GraphThree, GraphFour, DistanceMeasure.CANBERRA);
        Assert.assertNotEquals(0, dist2, 0);
    }
}
