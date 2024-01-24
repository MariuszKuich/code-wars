package pl.mariuszk.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectTheTimeString {

    public static String timeCorrect(String timeString) {
        if (timeString == null || timeString.isEmpty()) {
            return timeString;
        }

        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Matcher matcher =  pattern.matcher(timeString);
        if (!matcher.find()) {
            return null;
        }

        int hours = Integer.parseInt(matcher.group(1));
        int minutes = Integer.parseInt(matcher.group(2));
        int seconds = Integer.parseInt(matcher.group(3));

        minutes += seconds / 60;
        hours += minutes / 60;

        seconds %= 60;
        minutes %= 60;
        hours %= 24;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
