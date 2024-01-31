package pl.mariuszk.kyu7;

public class SumOfSequence {

    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int s = start; s <= end; s += step) {
            sum += s;
        }
        return sum;
    }
}
