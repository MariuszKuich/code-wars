package pl.mariuszk.kyu7;

public class CreditCardMask {

    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        return "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
    }
}
