package pl.mariuszk.kyu8;

public class ReversedDigitsArray {

    public static int[] digitize(long n) {
        //toString() can be omitted, .reverse().chars() works fine
        return new StringBuilder().append(n).reverse().toString()
                .chars()
                //Character::getNumericValue can be used instead
                .map(asciiCode -> asciiCode - 48)
                .toArray();

        //alternative approach using 'while' loop and arithmetic operations
//        int[] result = new int[String.valueOf(n).length()];
//        int idx = 0;
//        while (n > 0) {
//            long lastDigit = n % 10;
//            result[idx++] = (int) lastDigit;
//            n /= 10;
//        }
//        return result;
    }
}
