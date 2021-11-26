import dhbw.graphmetrics.graph.Graph;
import generators.BarabasiAlbertGenerator;
import org.junit.Assert;
import org.junit.Test;

public class BarabasiAlbertGeneratorTest {

    @Test
    public void BarabasiAlbertGenerator_correctNodesAndEdges() {
        var x = BarabasiAlbertGenerator.generate(50, 3);

        Assert.assertEquals(50, x.nodes().size());
        Assert.assertEquals(150, x.edges().size()/2);
    }
}
