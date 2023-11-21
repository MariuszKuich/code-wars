package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class HighestProfitWins {

    public static int[] minMax(int[] arr) {
        return new int[]{
                IntStream.of(arr).min().orElseThrow(),
                IntStream.of(arr).max().orElseThrow()
        };
    }
}
