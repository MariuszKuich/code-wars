package pl.mariuszk.kyu6;

import java.util.Arrays;

public class StringSplit {

    // note: a better solution would be to add the underscore to the string before splitting
    // (if the string consists of odd number of letters)
    public static String[] solution(String s) {
        // regex explanation: positive lookbehind (?<=criteria)
        // matching a string that has the last match (\G) followed by 2 characters
        return Arrays.stream(s.split("(?<=\\G.{2})"))
                .map(pair -> pair.length() == 1 ? pair + "_" : pair)
                .toArray(String[]::new);
    }
}
