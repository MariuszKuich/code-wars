package pl.mariuszk.kyu5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        List<String> reducedDirections = Arrays.asList(arr);
        boolean reductionsFound = true;
        while (reductionsFound) {
            reductionsFound = false;
            // I can delete elements from an ArrayList when iterating over it with a simple 'for' loop.
            // I could have used it instead of setting list's items to null and then copying non-null elements to a new list.
            for (int i = 0; i < reducedDirections.size() - 1; i++) {
                String currentElement = reducedDirections.get(i);
                if (currentElement == null) {
                    continue;
                }
                String nextElement = getNextElement(reducedDirections, i + 1);
                if (reductionIsPossible(currentElement, nextElement)) {
                    reductionsFound = true;
                    reducedDirections.set(i, null);
                    reducedDirections.set(i + 1, null);
                }
            }
            reducedDirections = reducedDirections.stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }
        return reducedDirections.toArray(String[]::new);
    }

    private static String getNextElement(List<String> directions, int idx) {
        if (directions.size() - 1 < idx) {
            return null;
        }
        return directions.get(idx);
    }

    private static boolean reductionIsPossible(String currentElement, String nextElement) {
        if (nextElement == null) {
            return false;
        }
        return ("NORTH".equals(currentElement) && "SOUTH".equals(nextElement))
                || ("SOUTH".equals(currentElement) && "NORTH".equals(nextElement))
                || ("EAST".equals(currentElement) && "WEST".equals(nextElement))
                || ("WEST".equals(currentElement) && "EAST".equals(nextElement));
    }
}
