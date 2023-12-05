package pl.mariuszk.kyu6;

public class ValidateCreditCardNumber {

    public static boolean validate(String n) {
        for (int i = n.length() - 2; i >= 0; i -= 2) {
            char digit = n.charAt(i);
            int doubledDigit = Integer.parseInt(String.valueOf(digit)) * 2;
            doubledDigit = doubledDigit > 9 ? doubledDigit - 9 : doubledDigit;
            n = n.substring(0, i) + doubledDigit + n.substring(i + 1);
        }
        int digitsSum = n.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> Integer.parseInt(String.valueOf(c)))
                .sum();
        return digitsSum % 10 == 0;
    }
}
