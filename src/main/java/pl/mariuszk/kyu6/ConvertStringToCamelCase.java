package pl.mariuszk.kyu6;

import java.lang.StringBuilder;

public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean nextUpperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '_' || character == '-') {
                nextUpperCase = true;
                continue;
            }
            if (nextUpperCase) {
                character = Character.toUpperCase(character);
                nextUpperCase = false;
            }
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
