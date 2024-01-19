package pl.mariuszk.kyu7;

public class SmallestValueOfAnArray {

    public static int findSmallest(final int[] numbers, String toReturn) {
        int smallestValue = numbers[0];
        int smallestIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            int nextValue = numbers[i];
            if (nextValue < smallestValue) {
                smallestValue = nextValue;
                smallestIndex = i;
            }
        }
        return toReturn.equals("index") ? smallestIndex : smallestValue;
    }
}
