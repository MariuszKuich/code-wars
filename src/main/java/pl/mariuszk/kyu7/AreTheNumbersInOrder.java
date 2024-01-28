package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class AreTheNumbersInOrder {

    public static boolean isAscOrder(int[] arr) {
        return IntStream.range(0, arr.length - 1).allMatch(i -> arr[i] <= arr[i + 1]);
    }
}
