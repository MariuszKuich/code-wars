package pl.mariuszk.kyu6;

public class StringArrayDuplicates {

    public static String[] dup(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String text = arr[i];
            StringBuilder builder = new StringBuilder();
            char lastLetter = ' ';
            for (char character : text.toCharArray()) {
                if (lastLetter != character) {
                    lastLetter = character;
                    builder.append(character);
                }
            }
            arr[i] = builder.toString();
        }

        return arr;
    }
}
