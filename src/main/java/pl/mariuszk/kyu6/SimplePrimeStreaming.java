package pl.mariuszk.kyu6;

import java.util.stream.LongStream;

public class SimplePrimeStreaming {

    public static String solve(int a, int b) {
        StringBuilder sequence = new StringBuilder();
        for (long l = 2; l < Long.MAX_VALUE; l++) {
            if (isPrime(l)) {
                sequence.append(l);
            }
            if (sequence.length() >= a + b) {
                break;
            }
        }
        return sequence.substring(a, a + b);
    }

    private static boolean isPrime(long number) {
        return LongStream.rangeClosed(2, number / 2).noneMatch(n -> number % n == 0);
    }
}
