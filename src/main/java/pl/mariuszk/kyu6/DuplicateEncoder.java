package pl.mariuszk.kyu6;

public class DuplicateEncoder {

    public static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < word.length() ; i++) {
            char c = word.charAt(i);
            // alternative approach: compare indexOf() and lastIndexOf() to determine if character occurs more than once
            int count = calculateOccurrences(word, c);
            builder.append(count > 1 ? ")" : "(");
        }
        return builder.toString();
    }

    private static int calculateOccurrences(String word, Character c) {
        return word.length() - word.replace(c.toString(), "").length();
    }
}
