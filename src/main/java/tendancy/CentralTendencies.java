package tendancy;

import java.util.Arrays;

public class CentralTendencies {

    public static Double calculateTendency(Double[] values, Tendency tendency) {
        if (tendency == Tendency.MEAN) {
            return arithmeticMean(values);
        }
        return null;
    }
    private static Double arithmeticMean(Double[] values) {
        return (Arrays.stream(values)
                .reduce(Double::sum).get() / values.length);
    }
}
