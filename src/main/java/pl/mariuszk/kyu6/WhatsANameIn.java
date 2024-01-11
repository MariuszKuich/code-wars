package pl.mariuszk.kyu6;

public class WhatsANameIn {

    public static boolean nameInStr(String str, String name) {
        str = str.toLowerCase();
        int lastIdx = -1;
        for (char letter : name.toLowerCase().toCharArray()) {
            int idx = str.indexOf(letter, lastIdx);
            if (idx == -1 || idx <= lastIdx) {
                return false;
            }
            lastIdx = idx;
        }
        return true;
    }
}
