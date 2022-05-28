import org.junit.Assert;
import org.junit.Test;
import components.normalize.Normalizer;

import static dhbw.graphmetrics.metrics.NodeMetric.CLOSENESS_CENTRALITY_DISCONNECTED;

public class NomalizerTest {
    @Test
    public void closenessDisconnectedTest() {
        Double[] values = {0.0327, 0.0466, 0.0544, 0.0466, 0.0327, 0.0204, 0.0204, 0.0};
        int amountNodes = 8;

        var result = Normalizer.normalizeNodeMetricArray(values, amountNodes, CLOSENESS_CENTRALITY_DISCONNECTED);

        Assert.assertEquals(8.0/21.0, result[2], 0.001);
        Assert.assertEquals(0.0, result[7], 0.001);
        Assert.assertEquals(1.0/7.0, result[6], 0.001);
    }
}
