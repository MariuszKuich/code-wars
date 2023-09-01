package pl.mariuszk.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(this::reverseFiveOrMoreLetterWord)
                .collect(Collectors.joining(" "));
    }

    private String reverseFiveOrMoreLetterWord(String word) {
        if (word.length() >= 5) {
            return new StringBuilder(word).reverse().toString();
        }
        return word;
    }
}
