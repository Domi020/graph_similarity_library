package components.python;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.metrics.NodeMetric;
import dhbw.graphmetrics.metrics.boundary.MetricsCalculation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Python script generation methods for illustrations and data for paper
 */
public class PythonGenerator {

    private static AtomicInteger graphNumber = new AtomicInteger(1);

    private synchronized static boolean writeScriptToFile(String script) {
        int number = graphNumber.getAndIncrement();
        var scriptPath = Path.of("res", String.format("GEDScript_%d.py", number));
        try {
            Files.writeString(scriptPath, script);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String generateGraphDrawer(Graph<Integer, Integer> graphOne, Graph<Integer, Integer> graphTwo,
                                             boolean writeToFile) {
        StringBuilder result = new StringBuilder("import networkx as nx\n");
        result.append("import matplotlib.pyplot as plt\n");
        result.append(generateGraphString(graphOne, "G1"));
        result.append(generateGraphString(graphTwo, "G2"));
        result.append("plt.figure(1)\n");
        result.append("nx.draw(G1)\n");
        result.append("plt.figure(2)\n");
        result.append("nx.draw(G2)\n");
        result.append("plt.show()\n");
        if (writeToFile) {
            writeScriptToFile(result.toString());
        }
        return result.toString();
    }

    public static String generateGEDTest(Graph<Integer, Integer> graphOne, Graph<Integer, Integer> graphTwo,
                                         boolean writeToFile) {
        StringBuilder result = new StringBuilder("import networkx as nx\n");
        result.append(generateGraphString(graphOne, "G1"));
        result.append(generateGraphString(graphTwo, "G2"));
        result.append("for v in nx.optimize_graph_edit_distance(G1, G2):\n");
        result.append("\tprint(v)");
        if (writeToFile) {
            writeScriptToFile(result.toString());
        }
        return result.toString();
    }

    public static String generateHistogram(Graph<Integer, Integer> x) {
        StringBuilder result = new StringBuilder("import networkx as nx\n");
        result.append("import matplotlib.pyplot as plt\n");
        result.append("plt.hist([");
        StringBuilder xAxis = new StringBuilder("[0, ");
        int i = 1;
        for (var node : x.nodes()) {
            result.append(MetricsCalculation.calculateNodeMetric(x, node, NodeMetric.DEGREE));
            result.append(", ");
            xAxis.append(i++);
            xAxis.append(", ");
        }
        result.delete(result.length() - 2, result.length() - 1);
        xAxis.delete(xAxis.length() - 2, xAxis.length() - 1);
        result.append("], ");
        xAxis.append("])\n");
        result.append(xAxis);
        result.append("plt.show()\n");
        writeScriptToFile(result.toString());
        return result.toString();
    }

    public static String generateGraphString(Graph<Integer, Integer> graph, String graphName) {
        StringBuilder graphString = new StringBuilder(String.format("%s = nx.Graph()\n",graphName));
        for (var node : graph.nodes()) {
            graphString.append(String.format("%s.add_node(%d)\n", graphName, node));
        }
        for (var edge : graph.edges()) {
            graphString.append(String.format("%s.add_edge(%d, %d)\n", graphName, edge.getFromNode(), edge.getToNode()));
        }
        return graphString.toString();
    }
}
