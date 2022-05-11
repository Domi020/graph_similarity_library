import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.GraphMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import generators.GraphGenerators;
import generators.RMATGenerator;
import python.PythonGraphGenerator;

public class ChromaticNumberTest {



    public static void main(String[] args) {
        Graph<Integer, Integer> x = RMATGenerator.generateWithoutDuplicates(3, 10, 0.9, 0.03, 0.03);
        var res = MetricsCalculation.calculateGraphMetric(x, GraphMetric.CHROMATIC_NUMBER);
        System.out.println(res);
        PythonGraphGenerator.generateGraphDrawer(x, x, true);
    }
}
