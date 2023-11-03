package pl.mariuszk.kyu7;

import java.util.List;

public class Testing123 {

    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, String.format("%d: %s", i + 1, lines.get(i)));
        }
        return lines;
    }
}
