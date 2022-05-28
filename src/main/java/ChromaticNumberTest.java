import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.GraphMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;
import components.generators.RMATGenerator;
import components.python.PythonGenerator;

public class ChromaticNumberTest {



    public static void main(String[] args) {
        Graph<Integer, Integer> x = RMATGenerator.generateWithoutDuplicates(3, 10, 0.9, 0.03, 0.03);
        var res = MetricsCalculation.calculateGraphMetric(x, GraphMetric.CHROMATIC_NUMBER);
        System.out.println(res);
        PythonGenerator.generateGraphDrawer(x, x, true);
    }
}
