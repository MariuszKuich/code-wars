package pl.mariuszk.kyu8;

public class FromAToZ {

    public static String gimmeTheLetters(String s) {
        StringBuilder builder = new StringBuilder();
        for (char startLetter = s.charAt(0); startLetter <= s.charAt(2); startLetter++) {
            builder.append(startLetter);
        }
        return builder.toString();
    }
}
