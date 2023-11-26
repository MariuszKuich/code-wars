package pl.mariuszk.kyu7;

import java.util.stream.LongStream;

public class NumbersWithThisDigitInside {

    public static long[] numbersWithDigitInside(long x, long d) {
        long[] numbersWithDigitInside = LongStream.rangeClosed(1, x)
                .filter(i -> String.valueOf(i).contains(String.valueOf(d)))
                .toArray();

        return new long[]{
                numbersWithDigitInside.length,
                LongStream.of(numbersWithDigitInside).sum(),
                LongStream.of(numbersWithDigitInside).reduce((a, b) -> a * b).orElse(0L)
        };
    }
}
