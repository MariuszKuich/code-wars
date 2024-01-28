package pl.mariuszk.kyu7;

import java.util.stream.Collectors;

public class Vaporcode {

    public static String vaporcode(String s) {
        return s.replaceAll(" ", "")
                .chars()
                .mapToObj(c -> String.valueOf((char) c).toUpperCase())
                .collect(Collectors.joining("  "));
    }
}
