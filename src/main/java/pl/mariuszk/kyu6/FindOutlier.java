package pl.mariuszk.kyu6;

import java.util.Arrays;

public class FindOutlier {

    public static int find(int[] integers) {
        // possible optimization #1: I could use an array filtered on line 9 to get even number if the array's length is 1
        // possible optimization #2: I could just use three first digits from the integers array to determine
        // if I'm looking for odd or even number
        if (Arrays.stream(integers).filter(i -> i % 2 == 0).toArray().length > 1) {
            return Arrays.stream(integers).filter(i -> i % 2 != 0).findFirst().orElseThrow();
        }
        return Arrays.stream(integers).filter(i -> i % 2 == 0).findFirst().orElseThrow();
    }
}
