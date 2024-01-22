package pl.mariuszk.kyu7;

public class ReverseLonger {

    public static String shorterReverseLonger(String a, String b) {
        return a.length() >= b.length()
                ? b + new StringBuilder(a).reverse() + b
                : a + new StringBuilder(b).reverse() + a;
    }
}
