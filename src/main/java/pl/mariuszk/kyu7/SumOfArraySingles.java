package pl.mariuszk.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfArraySingles {

    public static int repeats (int[] arr) {
        return IntStream.of(arr)
                .filter(i -> Arrays.stream(arr).filter(ii -> ii == i).count() == 1)
                .sum();
    }
}
