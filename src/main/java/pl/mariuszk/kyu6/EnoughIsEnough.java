package pl.mariuszk.kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int element : elements) {
            int occ = occurrences.getOrDefault(element, 0);
            if (occ >= maxOccurrences) {
                continue;
            }
            result.add(element);
            occurrences.put(element, occ + 1);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
