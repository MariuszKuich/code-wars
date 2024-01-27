package pl.mariuszk.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        int[] numbersArr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = IntStream.of(numbersArr).max().orElseThrow();
        int min = IntStream.of(numbersArr).min().orElseThrow();
        return max + " " + min;
    }
}
