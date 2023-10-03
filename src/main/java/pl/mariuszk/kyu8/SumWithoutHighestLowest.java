package pl.mariuszk.kyu8;

import java.util.Arrays;

public class SumWithoutHighestLowest {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        Arrays.sort(numbers);
        return Arrays.stream(numbers).sum() - numbers[0] - numbers[numbers.length - 1];
    }
}
