import MetricCalculators.CentralityCalculator;
import distance.DistanceMeasures;
import org.junit.Assert;
import org.junit.Test;
import tendancy.CentralTendencies;
import tendancy.Tendency;

public class TendancyTest {

    @Test
    public void arithmetic_mean_correctValues() {
        Double[] graphOne = {0.0, 3.0, 4.0, 5.0};
        Double[] graphTwo = {7.1, 6.666, 3.5, -1.0};

        var resultOne = CentralTendencies.calculateTendency(graphOne, Tendency.MEAN);
        var resultTwo = CentralTendencies.calculateTendency(graphTwo, Tendency.MEAN);

        Assert.assertEquals(3.0, resultOne, 0);
        Assert.assertEquals(4.0665, resultTwo, 0);
    }

    @Test
    public void geometric_mean_correctValues() {
        Double[] graphOne = {1.0, 3.0, 4.0, 5.0};
        Double[] graphTwo = {7.1, 6.666, 3.5, 1.0, 0.3, 76.8};

        var resultOne = CentralTendencies.calculateTendency(graphOne, Tendency.GEOMETRIC);
        var resultTwo = CentralTendencies.calculateTendency(graphTwo, Tendency.GEOMETRIC);

        Assert.assertEquals(2.7831, resultOne, 0.0001);
        Assert.assertEquals(3.9531, resultTwo, 0.0001);
    }

    @Test
    public void harmonic_mean_correctValues() {
        Double[] graphOne = {1.0, 3.0, 4.0, 5.0, 9.0};
        Double[] graphTwo = {7.1, 6.666, 3.5, 1.0, 0.3, 76.8};

        var resultOne = CentralTendencies.calculateTendency(graphOne, Tendency.HARMONIC);
        var resultTwo = CentralTendencies.calculateTendency(graphTwo, Tendency.HARMONIC);

        Assert.assertEquals(2.6392, resultOne, 0.0001);
        Assert.assertEquals(1.2187, resultTwo, 0.0001);
    }

    @Test
    public void median_correctValues() {
        Double[] graphOne = {1.0, 3.0, 5.0,4.0, 9.0};
        Double[] graphTwo = {3.5, 7.1, 6.666,  1.0, 0.3, 76.8};

        var resultOne = CentralTendencies.calculateTendency(graphOne, Tendency.MEDIAN);
        var resultTwo = CentralTendencies.calculateTendency(graphTwo, Tendency.MEDIAN);

        Assert.assertEquals(4.0, resultOne, 0);
        Assert.assertEquals(3.5, resultTwo, 0);
    }

    @Test
    public void modus_correctValues() {
        Double[] graphOne = {0.995656, 0.995656, 0.998,0.9245, 0.995657};
        Double[] graphTwo = {0.9956562, 0.995756, 0.995756,  0.995456, 0.9956, 0.99565};

        var resultOne = CentralTendencies.calculateTendency(graphOne, Tendency.MODUS);
        var resultTwo = CentralTendencies.calculateTendency(graphTwo, Tendency.MODUS);

        Assert.assertEquals(0.9957, resultOne, 0);
        Assert.assertEquals(0.9958, resultTwo, 0);
    }
}
