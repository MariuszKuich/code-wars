package pl.mariuszk.kyu8;

import java.util.stream.IntStream;

public class InvertValues {

    public static int[] invert(int[] array) {
        return IntStream.of(array).map(i -> i * -1).toArray();
    }
}
