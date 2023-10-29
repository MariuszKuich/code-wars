package pl.mariuszk.kyu5;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIncrementer {

    public static String incrementString(String str) {
        Pattern pattern = Pattern.compile("\\d+$");
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str + "1";
        }
        String numberStr = matcher.group();
        String incrementedNumber = new BigDecimal(numberStr).add(BigDecimal.ONE).toString();
        String newNumberStr = getNewNumberStr(numberStr, incrementedNumber);
        return str.substring(0, str.length() - numberStr.length()) + newNumberStr;
    }

    private static String getNewNumberStr(String numberStr, String incrementedNumber) {
        int lengthDifference = numberStr.length() - incrementedNumber.length();
        if (lengthDifference > 0) {
            return String.format("%0" + lengthDifference + "d%s", 0, incrementedNumber);
        }
        return incrementedNumber;
    }
}
