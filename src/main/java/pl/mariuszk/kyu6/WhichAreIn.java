package pl.mariuszk.kyu6;

import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s1 -> Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1)))
                .sorted()
                .toArray(String[]::new);
    }
}
