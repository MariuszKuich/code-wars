package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class DoubleEveryOther {

    public static int[] doubleEveryOther(int[] a) {
        return IntStream.range(0, a.length)
                .map(i -> i % 2 == 0 ? a[i] : a[i] * 2)
                .toArray();
    }
}
