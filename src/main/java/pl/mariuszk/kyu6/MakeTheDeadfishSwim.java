package pl.mariuszk.kyu6;

import java.util.ArrayList;
import java.util.List;

public class MakeTheDeadfishSwim {

    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<>();
        int currentValue = 0;
        for (String command : data.split("")) {
            switch (command) {
                case "i" -> currentValue++;
                case "d" -> currentValue--;
                case "s" -> currentValue *= currentValue;
                case "o" -> result.add(currentValue);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
