package pl.mariuszk.kyu6;

import java.util.Arrays;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(itemA -> Arrays.stream(b).noneMatch(itemB -> itemB == itemA))
                .toArray();
    }
}
