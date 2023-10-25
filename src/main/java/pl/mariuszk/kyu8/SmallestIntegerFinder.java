package pl.mariuszk.kyu8;

import java.util.Arrays;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        // IntStream.of() could be used instead
        return Arrays.stream(args).min().orElseThrow();
    }
}
