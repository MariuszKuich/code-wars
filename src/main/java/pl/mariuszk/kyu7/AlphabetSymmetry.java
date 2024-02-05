package pl.mariuszk.kyu7;

import java.util.stream.IntStream;

public class AlphabetSymmetry {

    public static int[] solve(String[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i].toLowerCase();
            result[i] = (int) IntStream.range(0, str.length())
                    .filter(j -> str.charAt(j) == 97 + j)
                    .count();
        }
        return result;
    }
}
