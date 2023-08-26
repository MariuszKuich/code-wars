package pl.mariuszk.kyu6;

import java.util.Arrays;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        int[] sortedOddNumbersArray = Arrays.stream(array).filter(i -> i % 2 != 0).sorted().toArray();
        int oddIdx = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                continue;
            }
            array[i] = sortedOddNumbersArray[oddIdx++];
        }
        return array;
    }
}

