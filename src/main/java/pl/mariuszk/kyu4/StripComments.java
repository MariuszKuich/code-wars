package pl.mariuszk.kyu4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String regex = String.format("[%s].*", String.join("", commentSymbols));
        return Arrays.stream(text.split("\n"))
                .map(line -> line.replaceAll(regex, "").stripTrailing())
                .collect(Collectors.joining("\n"));
    }
}
