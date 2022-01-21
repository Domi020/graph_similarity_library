package tendancy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CentralTendencies {

    public static Double calculateTendency(Double[] values, Tendency tendency) {
        if (tendency == Tendency.MEAN) {
            return arithmeticMean(values);
        } else if (tendency == Tendency.GEOMETRIC) {
            return geometricMean(values);
        } else if (tendency == Tendency.MODUS) {
            return modus(values);
        } else if (tendency == Tendency.MEDIAN) {
            return median(values);
        } else if (tendency == Tendency.HARMONIC) {
            return harmonicMean(values);
        }
        return null;
    }
    private static Double arithmeticMean(Double[] values) {
        return (Arrays.stream(values)
                .reduce(Double::sum).get() / values.length);
    }

    private static Double geometricMean(Double[] values) {
        double x = Math.pow(Arrays.stream(values)
                .reduce((val, res) -> val * res).get(), 1.0 / (double) values.length);
        return Double.isNaN(x) ? 0.0 : x;
    }

    private static Double modus(Double[] values) {
        double mostValue = -1.0; int mostValueCount = 0;
        Map<Double, Integer> amounts = new HashMap<>();
        for (var value : values) {
            Double rounded = Math.round(value * 10000) / 10000.0;
            var newValue = amounts.merge(rounded, 1, Integer::sum);
            if(newValue > mostValueCount) {
                mostValueCount = newValue;
                mostValue = rounded;
            }
        }
        return mostValue;
    }

    private static Double median(Double[] values) {
        List<Double> sorted = Arrays.stream(values).sorted().collect(Collectors.toList());
        return values.length % 2 == 0 ? sorted.get(values.length / 2 - 1)  : sorted.get(values.length / 2);
    }

    private static Double harmonicMean(Double[] values) {
        double res = 0.0;
        for(var value : values) {
            res += (1.0 / value);
        }
        return ((double) values.length / res);
    }
}
