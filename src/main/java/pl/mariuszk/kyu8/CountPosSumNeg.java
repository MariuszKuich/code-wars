package pl.mariuszk.kyu8;

public class CountPosSumNeg {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int positivesCount = 0;
        int negativesSum = 0;
        for (int number : input) {
            if (number > 0) {
                positivesCount++;
            }
            if (number < 0) {
                negativesSum += number;
            }
        }
        return new int[]{positivesCount, negativesSum};
    }
}
