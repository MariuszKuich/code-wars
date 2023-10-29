package pl.mariuszk.kyu6;

import java.util.stream.Stream;

public class LengthOfMissingArray {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null) {
            return 0;
        }
        Integer[] sortedLengths = Stream.of(arrayOfArrays)
                .filter(arr -> arr != null && arr.length != 0)
                .map(arr -> arr.length)
                .sorted()
                .toArray(Integer[]::new);
        if (sortedLengths.length != arrayOfArrays.length) {
            return 0;
        }
        for (int i = 0; i < sortedLengths.length; i++) {
            if (sortedLengths[i] + 1 != sortedLengths[i + 1]) {
                return sortedLengths[i] + 1;
            }
        }
        return 0;
    }
}
