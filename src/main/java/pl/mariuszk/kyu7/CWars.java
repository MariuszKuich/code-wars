package pl.mariuszk.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CWars {

    public static String initials(String name) {
        String[] words = name.split(" ");
        return IntStream.range(0, words.length)
                .mapToObj(i -> {
                    String word = words[i];
                    if (i == words.length - 1) {
                        return word.substring(0, 1).toUpperCase() + word.substring(1);
                    }
                    return word.substring(0, 1).toUpperCase();
                })
                .collect(Collectors.joining("."));
    }
}
