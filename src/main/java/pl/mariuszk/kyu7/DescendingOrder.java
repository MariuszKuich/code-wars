package pl.mariuszk.kyu7;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(
                String.valueOf(num).chars()
                        .mapToObj(c -> (char)c)
                        .map(String::valueOf)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining())
        );
    }
}
