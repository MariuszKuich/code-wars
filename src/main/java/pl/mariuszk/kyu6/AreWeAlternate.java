package pl.mariuszk.kyu6;

public class AreWeAlternate {

    public static boolean isAlt(String word) {
        String regex = "[aeiou]";
        boolean nextCharIsConsonant = word.substring(0, 1).matches(regex);

        for (char character : word.substring(1).toCharArray()) {
            if ((nextCharIsConsonant && String.valueOf(character).matches(regex))
                    || (!nextCharIsConsonant && !String.valueOf(character).matches(regex))) {
                return false;
            }
            nextCharIsConsonant = !nextCharIsConsonant;
        }

        return true;
    }
}
