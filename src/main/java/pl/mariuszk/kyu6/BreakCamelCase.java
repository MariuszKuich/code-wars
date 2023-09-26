package pl.mariuszk.kyu6;

import java.util.ArrayList;
import java.util.List;

public class BreakCamelCase {

    public static String camelCase(String input) {
        // I could simply use the following - referring to captured groups from the regular expression.
//        return input.replaceAll("([A-Z])", " $1");
        List<String> words = new ArrayList<>();
        int wordStartIdx = 0;
        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            // ASCII table values for uppercase letters
            if ((letter >= 65 && letter <= 90)) {
                words.add(input.substring(wordStartIdx, i));
                wordStartIdx = i;
            }
        }
        words.add(input.substring(wordStartIdx));
        return String.join(" ", words);
    }
}
