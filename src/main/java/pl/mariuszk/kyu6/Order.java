package pl.mariuszk.kyu6;

public class Order {

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        String[] wordsArray = words.split(" ");
        String[] sortedWords = new String[wordsArray.length];
        for (String word : wordsArray) {
            int idx = Integer.parseInt(word.replaceAll("\\D", ""));
            sortedWords[idx - 1] = word;
        }
        return String.join(" ", sortedWords);
    }
}
