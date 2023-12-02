package pl.mariuszk.kyu6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerDepth {

    public int computeDepth(int n) {
        int multiplier = 1;
        Set<Integer> digits = new HashSet<>();
        while (!digits.containsAll(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))) {
            int multiplicationResult = n * multiplier++;
            while (multiplicationResult > 0) {
                digits.add(multiplicationResult % 10);
                multiplicationResult /= 10;
            }
        }
        return multiplier - 1;
    }
}
