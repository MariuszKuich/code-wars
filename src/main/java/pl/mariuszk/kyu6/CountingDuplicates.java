package pl.mariuszk.kyu6;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int duplicateCharactersCount = 0;
        while (!text.isEmpty()) {
            int textLength = text.length();
            text = text.replaceAll(text.substring(0, 1), "");
            if (text.length() < textLength - 1) {
                //more than one character was removed so the character was duplicated
                duplicateCharactersCount++;
            }
        }
        return duplicateCharactersCount;
    }
}
