package pl.mariuszk.kyu7;

public class PrinterErrors {

    public static String printerError(String s) {
        return String.format("%d/%d", s.replaceAll("[a-m]", "").length(), s.length());
    }
}
