package pl.mariuszk.kyu7;

public class Square {

    public static boolean isSquare(int n) {
        //Actually there's no need for this condition since comparing and casting Double.NaN doesn't result with an exception
        if (n < 0) {
            return false;
        }
        double squareRoot = Math.sqrt(n);
        return squareRoot == (int) squareRoot;
    }
}
