package pl.mariuszk.kyu6;

import java.util.Arrays;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int leftSideSum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum -= arr[idx];
            if (leftSideSum == sum) {
                return idx;
            }
            leftSideSum += arr[idx];
        }
        return -1;
    }
}
