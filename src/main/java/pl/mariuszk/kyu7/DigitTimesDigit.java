package pl.mariuszk.kyu7;

import java.util.stream.Collectors;

public class DigitTimesDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(
                String.valueOf(n).chars()
                        .mapToObj(c -> (char)c)
                        .map(c -> {
                            int digit = Character.getNumericValue(c);
                            return String.valueOf(digit * digit);
                        })
                        .collect(Collectors.joining())
        );
    }
}
