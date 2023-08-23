package pl.mariuszk.kyu7;

public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        //n * n * n would be cleaner since it wouldn't require casting number to a different type
        return (int) Math.pow(n, 3);
    }
}
