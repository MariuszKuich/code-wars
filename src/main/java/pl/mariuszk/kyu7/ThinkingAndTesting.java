package pl.mariuszk.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ThinkingAndTesting {

    public static String testSomethingCapitalized(String s) {
        if (s.isBlank()) {
            return s;
        }
        return Arrays.stream(s.split(" "))
                .map(ss -> ss.substring(0, ss.length() - 1) + ss.substring(ss.length() - 1).toUpperCase())
                .collect(Collectors.joining(" "));
    }
}
