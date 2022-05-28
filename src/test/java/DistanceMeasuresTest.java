import components.distance.DistanceMeasure;
import components.distance.DistanceMeasures;
import org.junit.Assert;
import org.junit.Test;

public class DistanceMeasuresTest {

    @Test
    public void canberra_distance_correctValueWithInts() {
        Double[] graphOne = {0.0, 3.0, 4.0, 5.0};
        Double[] graphTwo = {7.0, 6.0, 3.0, -1.0};

        var result = DistanceMeasures.CanberraDistance(graphOne, graphTwo);

        Assert.assertEquals(2.476, result, 0.001);
    }
    @Test
    public void euclidean_distance_correctValueWithInts() {
        Double graphOne = 5.0;
        Double graphTwo = 3.0;

        var result = DistanceMeasures.calculateDistance(graphOne, graphTwo, DistanceMeasure.EUCLIDEAN);

        Assert.assertEquals(2.0, result, 0.00000000001);
    }
}
