package pl.mariuszk.kyu7;

public class RegexValidatePIN {

    public static boolean validatePin(String pin) {
        return pin.matches("^(\\d{4}|\\d{6})$");
    }
}
