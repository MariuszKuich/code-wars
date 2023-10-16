package pl.mariuszk.kyu7;

public class ExesAndOhs {

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replaceAll("[^x]", "").length() == str.replaceAll("[^o]", "").length();
    }
}
