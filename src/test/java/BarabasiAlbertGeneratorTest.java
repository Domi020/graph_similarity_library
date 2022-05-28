import dhbw.graphmetrics.metrics.GraphMetric;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import components.generators.BarabasiAlbertGenerator;
import org.junit.Assert;
import org.junit.Test;

public class BarabasiAlbertGeneratorTest {

    @Test
    public void BarabasiAlbertGenerator_correctNodesAndEdges() {
        var x = BarabasiAlbertGenerator.generate(50, 3);

        Assert.assertEquals(50, x.nodes().size());
        Assert.assertEquals(3 + 47 * 3, x.edges().size()/2);
    }

    @Test
    public void BarabasiAlbertGenerator_onlyOneComp() {
        var x = BarabasiAlbertGenerator.generate(50, 3);

        Assert.assertEquals(1, MetricsCalculation.calculateGraphMetric(x, GraphMetric.NUMBER_OF_CONNECTED_COMPONENTS));
    }

    @Test
    public void BarabasiAlbertGenerator_diffGraphs() {
        var x = BarabasiAlbertGenerator.generate(50, 3);
        var y = BarabasiAlbertGenerator.generate(50, 3);

        for (int i = 0 ; i<50; i++) {
            if (!MetricsCalculation.calculateNodeMetric(x, i, NodeMetric.DEGREE).equals(
                    MetricsCalculation.calculateNodeMetric(y, i, NodeMetric.DEGREE))) {
                break;
            }
            if (i == 49) {
                Assert.fail();
            }
        }
    }
}
