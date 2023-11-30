package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class NthSeries {

    public static String seriesSum(int n) {
        double number = IntStream.range(0, n)
                .mapToDouble(i -> 1.0 / (3.0 * i + 1.0))
                .sum();
        return String.format("%.2f", number);
    }
}
