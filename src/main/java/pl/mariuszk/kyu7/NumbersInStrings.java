package pl.mariuszk.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInStrings {

    public static int solve(String s) {
        int largestNumber = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
