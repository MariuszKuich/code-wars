package pl.mariuszk.kyu6;

import java.util.stream.IntStream;

public class FindOdd {

    public static int findIt(int[] a) {
        for (int number : IntStream.of(a).distinct().toArray()) {
            long occurrences = IntStream.of(a).filter(n -> n == number).count();
            if (occurrences % 2 != 0) {
                return number;
            }
        }
        return -1;
    }
}
