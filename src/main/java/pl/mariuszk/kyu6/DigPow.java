package pl.mariuszk.kyu6;

import static java.lang.Math.pow;

public class DigPow {

    public static long digPow(int n, int p) {
        int nLength = String.valueOf(n).length();
        int sumOfPowDigits = 0;
        while (nLength > 0) {
            int nextDigit = (int) (n % pow(10, nLength) / pow(10, --nLength));
            sumOfPowDigits += (int) pow(nextDigit, p++);
        }
        double result = (double) sumOfPowDigits / n;
        return result % 1 == 0 ? (int) result : -1;
    }
}
