package pl.mariuszk.kyu6;

public class DigitalRoot {

    public static int digitalRoot(int n) {
        while (n > 9) {
            n = calculateSumOfDigits(n);
        }
        return n;
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
