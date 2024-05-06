package pl.mariuszk.kyu7;

public class NextPerfectSquare {

    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        if (sqrt != (int) sqrt) {
            return -1;
        }
        return (long) Math.pow(sqrt + 1, 2);
    }
}
