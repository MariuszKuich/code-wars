package pl.mariuszk.kyu6;

public class AscendDescend {

    public static String ascendDescend(int length, int minimum, int maximum) {
        if (length == 0 || minimum > maximum) {
            return "";
        }
        if (minimum == maximum) {
            return String.valueOf(minimum).repeat(length);
        }
        StringBuilder builder = new StringBuilder();
        int currentNumber = minimum;
        int valueToAdd = 1;
        while (builder.length() < length) {
            builder.append(currentNumber);
            if (currentNumber == maximum) {
                valueToAdd = -1;
            } else if (currentNumber == minimum) {
                valueToAdd = 1;
            }
            currentNumber += valueToAdd;
        }
        return builder.substring(0, length);
    }
}
