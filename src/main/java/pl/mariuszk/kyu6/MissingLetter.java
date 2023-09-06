package pl.mariuszk.kyu6;

public class MissingLetter {

    public static char findMissingLetter(char[] array) {
        // comparing ASCII table codes
        // i = 1 because length of the array is always at least 2
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                continue;
            }
            return (char) (array[i] - 1);
        }
        // always exactly one letter is missing so if the missing letter was not found - it's an illegal state
        throw new IllegalStateException();
    }
}
