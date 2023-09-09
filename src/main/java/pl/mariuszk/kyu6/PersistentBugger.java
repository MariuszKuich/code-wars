package pl.mariuszk.kyu6;

public class PersistentBugger {

    public static int persistence(long n) {
        int counter = 0;
        while (n > 9) {
            long digitsProduct = 1;
            while (n > 0) {
                long nextDigit = n % 10;
                digitsProduct *= nextDigit;
                n /= 10;
            }
            n = digitsProduct;
            counter++;
        }
        return counter;
    }
}
