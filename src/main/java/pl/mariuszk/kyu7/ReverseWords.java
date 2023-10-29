package pl.mariuszk.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        return Stream.of(original.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
