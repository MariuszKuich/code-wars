package pl.mariuszk.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining(" "));
    }
}
