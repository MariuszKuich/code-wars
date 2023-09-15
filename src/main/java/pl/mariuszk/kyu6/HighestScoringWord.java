package pl.mariuszk.kyu6;

public class HighestScoringWord {

    public static String high(String s) {
        int highestScore = 0;
        String highestScoreWord = "";
        for (String word : s.split(" ")) {
            int score = word.chars().map(c -> c - 96).sum();
            if (score > highestScore) {
                highestScore = score;
                highestScoreWord = word;
            }
        }
        return highestScoreWord;
    }
}
