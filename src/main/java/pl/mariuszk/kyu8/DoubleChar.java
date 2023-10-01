package pl.mariuszk.kyu8;

public class DoubleChar {

    public static String doubleChar(String s) {
        return s.replaceAll("(.)", "$1$1");
    }
}
