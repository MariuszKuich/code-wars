package pl.mariuszk.kyu7;

public class SignChangeCount {

    public static int signChange(int[] arr) {
        int signChanges = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int num1 = arr[i];
            int num2 = arr[i + 1];
            if (num1 < 0 && num2 >= 0 || num1 >= 0 && num2 < 0) {
                signChanges++;
            }
        }
        return signChanges;
    }
}
