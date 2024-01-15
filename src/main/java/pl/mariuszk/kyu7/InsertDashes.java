package pl.mariuszk.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertDashes {

    public static String insertDash(int num) {
        int[] digits = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
        return IntStream.range(0, digits.length)
                .mapToObj(idx -> {
                    int currDigit = digits[idx];
                    int nextDigit = idx == digits.length - 1 ? 0 : digits[idx + 1];
                    boolean bothDigitsAreOdd = isOdd(currDigit) && isOdd(nextDigit);
                    String suffix = bothDigitsAreOdd ? "-" : "";
                    return currDigit + suffix;
                })
                .collect(Collectors.joining());
    }

    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
