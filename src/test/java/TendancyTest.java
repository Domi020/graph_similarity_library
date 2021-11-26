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
}
