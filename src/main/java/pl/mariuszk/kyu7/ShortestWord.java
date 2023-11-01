package pl.mariuszk.kyu7;

import java.util.Arrays;

public class ShortestWord {

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .map(String::length)
                .min(Integer::compare)
                .orElse(0);

    }
}
