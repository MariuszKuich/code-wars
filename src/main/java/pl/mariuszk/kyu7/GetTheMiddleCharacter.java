package pl.mariuszk.kyu7;

public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        int middleIdx = word.length() / 2;
        return word.substring(word.length() % 2 == 0 ? middleIdx - 1 : middleIdx, middleIdx + 1);
    }
}
