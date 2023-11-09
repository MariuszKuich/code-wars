package pl.mariuszk.kyu6;

import java.util.List;

public class CountTheSmileyFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream()
                .filter(s -> s.matches("^[:;][-~]?[)D]$"))
                .count();
    }
}
