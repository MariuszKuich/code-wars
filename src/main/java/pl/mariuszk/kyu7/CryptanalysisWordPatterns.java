package pl.mariuszk.kyu7;

import java.util.HashMap;
import java.util.Map;

public class CryptanalysisWordPatterns {

    public static String wordPattern(final String word) {
        Map<Character, Integer> letterCodes = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        int codeIdx = 0;
        for (int i = 0; i < word.length(); i++) {
            char character = Character.toLowerCase(word.charAt(i));
            int code = letterCodes.getOrDefault(character, codeIdx);
            if (code == codeIdx) {
                letterCodes.put(character, codeIdx++);
            }
            builder.append(code).append(".");
        }
        return builder.substring(0, builder.length() - 1);
    }
}
