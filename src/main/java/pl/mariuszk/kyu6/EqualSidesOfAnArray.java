package pl.mariuszk.kyu6;

import java.util.Arrays;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if (sum == 0) {
            return 0;
        }
        int leftSideSum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum -= arr[idx];
            leftSideSum += (idx > 0) ? arr[idx - 1] : 0;
            if (leftSideSum == sum) {
                return idx;
            }
        }
        return -1;
    }
}
