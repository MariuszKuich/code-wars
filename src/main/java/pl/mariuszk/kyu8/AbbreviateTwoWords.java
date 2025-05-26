package pl.mariuszk.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(w -> w.substring(0, 1).toUpperCase())
                .collect(Collectors.joining("."));
    }
}
