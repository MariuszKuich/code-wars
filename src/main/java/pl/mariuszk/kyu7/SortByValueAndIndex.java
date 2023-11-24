package pl.mariuszk.kyu7;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SortByValueAndIndex {

    public static int[] sortByValueAndIndex(int[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> new Pair(array[i - 1], i * array[i - 1]))
                .sorted(Comparator.comparing(p -> p.product))
                .mapToInt(p -> p.originalValue)
                .toArray();

    }

    static class Pair {
        int originalValue;
        int product;

        Pair(int value, int product) {
            this.originalValue = value;
            this.product = product;
        }
    }
}
