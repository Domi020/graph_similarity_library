package tendancy;

import java.util.Arrays;

public class CentralTendencies {
    public static Double arithmeticMean(Double[] values) {
        return (Arrays.stream(values)
                .reduce(Double::sum).get() / values.length);
    }
}
