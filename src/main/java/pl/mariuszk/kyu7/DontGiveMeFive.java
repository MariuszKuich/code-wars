package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class DontGiveMeFive {

    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end)
                .filter(i -> !String.valueOf(i).contains("5"))
                .count();
    }
}
