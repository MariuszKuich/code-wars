package pl.mariuszk.kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumConsecutives {

    public static List<Integer> sumConsecutives(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        result.add(numbers.get(0));
        int lastNumber = result.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (lastNumber == currentNumber) {
                int lastIdx = result.size() - 1;
                result.set(lastIdx, result.get(lastIdx) + currentNumber);
            } else {
                lastNumber = currentNumber;
                result.add(currentNumber);
            }
        }
        return result;
    }
}
