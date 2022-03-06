package generators;

import dhbw.graphmetrics.graph.Graph;

import java.util.Map;

public class GraphGenerators {
    private GraphGenerators() {}

    public static Graph<Integer, Integer> generateGraph(GraphGeneratorMethod method, Map<String, Object> options) {
        switch (method) {
            case RMAT -> RMATGenerator.generate((int) options.get("k"), (int) options.get("M"),
                    (double) options.get("alpha"), (double) options.get("beta"), (double) options.get("gamma"));
            case BARABASI_ALBERT -> BarabasiAlbertGenerator.generate((int) options.get("nodes"),
                    (int) options.get("edgesPerIteration"));
            case COMPLETE -> SpecialGraphGenerator.generateCompleteGraph((int) options.get("amountNodes"));
            case STAR -> SpecialGraphGenerator.generateStarGraph((int) options.get("amountNodes"));
            case WITHOUT_EDGES -> SpecialGraphGenerator.generateGraphWithoutEdges((int) options.get("amountNodes"));
        }
        return null;
    }
}
