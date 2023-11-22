package pl.mariuszk.kyu6;

public class WordA10n {

    public String abbreviate(String string) {
        String[] words = string.split("[^a-zA-Z]+");
        for (String word : words) {
            if (word.length() < 4) {
                continue;
            }
            String a10n = String.format("%s%d%s", word.charAt(0), word.length() - 2, word.charAt(word.length() - 1));
            string = string.replaceFirst(word, a10n);
        }
        return string;
    }
}
