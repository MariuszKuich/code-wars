package pl.mariuszk.kyu7;

public class RoundUpToNextMultipleOf5 {

    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}
