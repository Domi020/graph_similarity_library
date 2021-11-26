import MetricCalculators.CentralityCalculator;
import dhbw.graphmetrics.metrics.NodeMetric;
import distance.DistanceMeasure;
import distance.DistanceMeasures;
import generators.RMATGenerator;
import tendancy.CentralTendencies;
import tendancy.Tendency;

public class MetricCompareTest {


    private Tendency tendency;
    private DistanceMeasure distanceMeasure;
    private NodeMetric metric;

    private double RMATAlpha;
    private double RMATBeta;
    private double RMATGamma;
    private int RMATNodes;
    private int RMATEdges;


    public void setTendency(Tendency tendency) {
        this.tendency = tendency;
    }

    public void setDistanceMeasure(DistanceMeasure measure) {
        this.distanceMeasure = measure;
    }

    public void setMetric(NodeMetric nodeMetric) {
        this.metric = nodeMetric;
    }

    public void setRMATParams(int RMATNodes, int RMATEdges, double RMATAlpha, double RMATBeta, double RMATGamma) {
        this.RMATEdges = RMATEdges;
        this.RMATNodes = RMATNodes;
        this.RMATAlpha = RMATAlpha;
        this.RMATBeta = RMATBeta;
        this.RMATGamma = RMATGamma;
    }

    public void doTest(int amount) {
        double max = 0.0;
        double min = 1.0;
        double avg = 0.0;

        for(int i = 0; i < amount; i++) {
            RMATGenerator.generate(RMATNodes, RMATEdges, RMATAlpha, RMATBeta, RMATGamma);
            var x = RMATGenerator.generateGraphFromMatrix();
            RMATGenerator.generate(RMATNodes, RMATEdges, RMATAlpha, RMATBeta, RMATGamma);
            var y = RMATGenerator.generateGraphFromMatrix();
            var closenessValuesOne = CentralityCalculator.calculateCentrality(metric, x);
            var closenessValuesTwo = CentralityCalculator.calculateCentrality(metric, y);
            var meanOne = CentralTendencies.calculateTendency(closenessValuesOne, tendency);
            var meanTwo = CentralTendencies.calculateTendency(closenessValuesTwo, tendency);
            var res = 1 - DistanceMeasures.calculateDistance(meanOne, meanTwo, distanceMeasure);
            if (res > max) max = res;
            if (res < min) min = res;
            avg += res;
            System.out.println(res);
            // System.out.println();
        }
        avg = avg / (double) amount;
        System.out.println("Max: " + max + "\nMin: "+ min + "\navg: "+ avg);
    }
}
