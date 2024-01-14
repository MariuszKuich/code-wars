package pl.mariuszk.kyu7;

public class Digitize {

    public static int[] digitize(int n) {
        return String.valueOf(n).chars().map(Character::getNumericValue).toArray();
    }
}
