package pl.mariuszk.kyu7;

import java.util.List;

public class TheOldSwitcheroo {

    public static String vowel2Index(String s) {
        StringBuilder builder = new StringBuilder();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(Character.toLowerCase(c))) {
                builder.append(i + 1);
                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }
}
