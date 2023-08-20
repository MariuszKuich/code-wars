package pl.mariuszk.kyu5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class Greed {

    public static int greedy(int[] dice) {
        Map<Integer, Function<Long, Integer>> digitsMap = Map.of(
                1, n -> getScoreForOnesAndFives(n, 1000, 100),
                2, n -> getScoreForDigitsOtherThanOnesAndFives(n, 200),
                3, n -> getScoreForDigitsOtherThanOnesAndFives(n, 300),
                4, n -> getScoreForDigitsOtherThanOnesAndFives(n, 400),
                5, n -> getScoreForOnesAndFives(n, 500, 50),
                6, n -> getScoreForDigitsOtherThanOnesAndFives(n, 600)
        );
        return digitsMap.entrySet().stream()
                .map(e -> {
                    long numberOfDigits = Arrays.stream(dice).filter(d -> d == e.getKey()).count();
                    return e.getValue().apply(numberOfDigits);
                })
                .reduce(0, Integer::sum);

    }

    private static int getScoreForOnesAndFives(long numberOfDigits, int scoreForThree, int scoreForOne) {
        int score = 0;
        while (numberOfDigits > 0) {
            if (numberOfDigits >= 3) {
                score += scoreForThree;
                numberOfDigits -= 3;
                continue;
            }
            score += scoreForOne;
            numberOfDigits--;
        }
        return score;
    }

    private static int getScoreForDigitsOtherThanOnesAndFives(long numberOfDigits, int scoreForThree) {
        return numberOfDigits >= 3 ? scoreForThree : 0;
    }
}