package pl.mariuszk.kyu7;

public class AnagramDetection {

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        test = test.toLowerCase();
        original = original.toLowerCase();
        for (String letter : original.split("")) {
            if (test.isEmpty()) {
                return false;
            }
            test = test.replaceFirst(letter, "");
        }
        return test.isEmpty();
    }
}
