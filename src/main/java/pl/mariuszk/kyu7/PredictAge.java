package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class PredictAge {

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        return (int) Math.floor(
                Math.sqrt(
                        IntStream.of(age1, age2, age3, age4, age5, age6, age7, age8)
                                .map(i -> i * i)
                                .reduce(0, Integer::sum)
                ) / 2
        );
    }
}
