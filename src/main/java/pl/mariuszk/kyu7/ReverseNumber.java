package pl.mariuszk.kyu7;

public class ReverseNumber {

    public static int reverse(int number) {
        String reversedNumber = new StringBuilder(String.valueOf(number)).reverse().toString();
        reversedNumber = reversedNumber.charAt(reversedNumber.length() - 1) == '-'
                ? "-" + reversedNumber.substring(0, reversedNumber.length() - 1) : reversedNumber;
        return Integer.parseInt(reversedNumber);
    }
}
