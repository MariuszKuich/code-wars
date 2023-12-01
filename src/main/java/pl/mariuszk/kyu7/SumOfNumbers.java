package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class SumOfNumbers {

    public int getSum(int a, int b) {
        IntStream stream = b > a ? IntStream.rangeClosed(a, b) : IntStream.rangeClosed(b, a);
        return stream.sum();
    }
}
