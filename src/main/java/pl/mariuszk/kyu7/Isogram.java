package pl.mariuszk.kyu7;

public class Isogram {

    public static boolean isIsogram(String str) {
        // .count() could be used instead of .toArray()
        int[] uniqueLetterCodes = str.toLowerCase().chars().distinct().toArray();
        return str.length() == uniqueLetterCodes.length;
    }
}
