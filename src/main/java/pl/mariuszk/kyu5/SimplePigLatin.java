package pl.mariuszk.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimplePigLatin {

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> {
                    if (!s.matches("^[a-zA-Z].*")) {
                        return s;
                    }
                    return s.substring(1) + s.charAt(0) + "ay";
                })
                .collect(Collectors.joining(" "));
    }
}
