package pl.mariuszk.kyu7;

public class ShiftLeft {

    public static int shiftLeft(String a, String b) {
        int numberOfMoves = 0;
        while (!a.equals(b)) {
            if (a.length() > b.length()) {
                a = a.substring(1);
            } else {
                b = b.substring(1);
            }
            numberOfMoves++;
        }
        return numberOfMoves;
    }
}
