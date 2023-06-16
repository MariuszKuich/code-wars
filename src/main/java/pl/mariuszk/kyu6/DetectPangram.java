package pl.mariuszk.kyu6;

import java.util.stream.Collectors;

public class DetectPangram {

    public boolean check(String sentence) {
        long numberOfLettersInAlphabet = 26L;
        long distinctLettersCount = sentence.toUpperCase().chars()
                .mapToObj(c -> (char)c)
                .filter(c -> c >= 'A' && c <= 'Z')
                .distinct()
                .count();

        return distinctLettersCount == numberOfLettersInAlphabet;
    }
}
