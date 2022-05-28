package components.generators;

import dhbw.graphmetrics.graph.Graph;
import org.apache.commons.math3.util.Pair;

import java.util.List;
import java.util.Map;

/**
 * Graph generate service
 */
public class GraphGenerators {
    private GraphGenerators() {}

    public static Graph<Integer, Integer> generateGraph(GraphGeneratorMethod method, Map<String, Object> options) {
        switch (method) {
            case RMAT -> {
                if (options.containsKey("mode") && (options.get("mode").equals("onlyBelow"))) {
                    return RMATGenerator.generateWithoutDuplicates((int) options.get("k"), (int) options.get("M"),
                            (double) options.get("alpha"), (double) options.get("beta"), (double) options.get("gamma"));
                } else if (options.containsKey("mode") && (options.get("mode").equals("undirected"))) {
                    return RMATGenerator.generateUndirected((int) options.get("k"), (int) options.get("M"),
                            (double) options.get("alpha"), (double) options.get("beta"), (double) options.get("gamma"));
                } else {
                    return RMATGenerator.generate((int) options.get("k"), (int) options.get("M"),
                            (double) options.get("alpha"), (double) options.get("beta"), (double) options.get("gamma"));
                }
            }
            case BARABASI_ALBERT -> {
                return BarabasiAlbertGenerator.generate((int) options.get("nodes"),
                        (int) options.get("edgesPerIteration"));
            }
            case COMPLETE -> {
                return SpecialGraphGenerator.generateCompleteGraph((int) options.get("amountNodes"));
            }
            case STAR -> {
                return SpecialGraphGenerator.generateStarGraph((int) options.get("amountNodes"));
            }
            case WITHOUT_EDGES -> {
                return SpecialGraphGenerator.generateGraphWithoutEdges((int) options.get("amountNodes"));
            }
            case UNIQUE -> {
                return SpecialGraphGenerator.generateUniqueGraph((List<Integer>) options.get("nodes"),
                        (List<Pair<Integer, Integer>>) options.get("edges"));
            }
        }
        return null;
    }
}
