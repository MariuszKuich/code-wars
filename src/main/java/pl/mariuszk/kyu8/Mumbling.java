package pl.mariuszk.kyu8;

public class Mumbling {

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            String accumulated = String.valueOf(s.charAt(i - 1)).repeat(i).toLowerCase();
            accumulated = accumulated.substring(0, 1).toUpperCase() + accumulated.substring(1);
            builder.append(accumulated);
            if (i < s.length()) {
                builder.append("-");
            }
        }
        return builder.toString();
    }
}
