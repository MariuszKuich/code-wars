package pl.mariuszk.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s) {
        return Stream.of(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
