package pl.mariuszk.kyu6;

import java.util.Map;
import java.util.Stack;

public class ValidBraces {

    private static final Map<Character, Character> PAIRS_OF_BRACES = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    public boolean isValid(String braces) {
        Stack<Character> closingBraces = new Stack<>();
        for (int idx = 0; idx < braces.length(); idx++) {
            char brace = braces.charAt(idx);
            if (isClosingBrace(brace)) {
                if (closingBraces.isEmpty()) {
                    return false;
                }
                char lastBraceToClose = closingBraces.pop();
                if (lastBraceToClose != brace) {
                    return false;
                }
                continue;
            }
            closingBraces.push(PAIRS_OF_BRACES.get(brace));
        }
        return closingBraces.isEmpty();
    }

    private static boolean isClosingBrace(char brace) {
        return brace == ')' || brace == ']' || brace == '}';
    }
}
