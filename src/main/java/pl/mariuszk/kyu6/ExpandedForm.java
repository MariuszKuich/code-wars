package pl.mariuszk.kyu6;

import java.util.ArrayList;
import java.util.List;

public class ExpandedForm {

    public static String expandedForm(int num) {
        List<String> numbers = new ArrayList<>();
        int idx = 0;
        while (num > 0) {
            int mod = num % 10;
            if (mod != 0) {
                //adding each element at the beginning of the list since numbers will be printed in reverse order
                numbers.add(0, String.valueOf(mod * (int) Math.pow(10, idx)));
            }
            num /= 10;
            idx++;
        }
        return String.join(" + ", numbers);
    }
}
