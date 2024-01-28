package pl.mariuszk.kyu5;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<String, Integer> lastUsedIdx = new HashMap<>();
        for (String letter : str2.split("")) {
            int lastIdx = lastUsedIdx.getOrDefault(letter, -1);
            int letterIdx = str1.indexOf(letter, lastIdx + 1);
            if (letterIdx == -1) {
                return false;
            }
            lastUsedIdx.put(letter, letterIdx);
        }
        return true;
    }
}
