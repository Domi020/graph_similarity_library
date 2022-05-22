import generators.GraphGeneratorMethod;
import generators.GraphGenerators;
import org.junit.Test;

import java.util.HashMap;

public class GeneratorPerfTest {

    @Test
    public void doGeneratorTest() {
        //512 Knoten, 80000 Kanten

        var startTime = System.nanoTime();
        var firstGraph = new HashMap<String, Object>();
        firstGraph.put("k", 5); firstGraph.put("M", 300); firstGraph.put("alpha", 0.2); firstGraph.put("beta", 0.2);
        firstGraph.put("gamma", 0.3); firstGraph.put("mode", "onlyBelow");
        var x = GraphGenerators.generateGraph(GraphGeneratorMethod.RMAT, firstGraph);
        var firstGraphTime = System.nanoTime() - startTime;
        System.out.println(firstGraphTime / 1000000);

        var secondGraph = new HashMap<String, Object>();
        secondGraph.put("nodes", 32); secondGraph.put("edgesPerIteration", 12);
        var y = GraphGenerators.generateGraph(GraphGeneratorMethod.BARABASI_ALBERT, secondGraph);
        var secondGraphTime = System.nanoTime() - startTime - firstGraphTime;
        System.out.println(secondGraphTime / 1000000);
        var gesTime = System.nanoTime() - startTime;
        System.out.println(gesTime / 1000000);
    }

}
