package pl.mariuszk.kyu6;

//import java.util.Arrays;

public class FindUniqueNumber {

    public static double findUniq(double[] arr) {
        //sorting whole array may not be the most efficient thing to do
//        arr = Arrays.stream(arr).sorted().toArray();
//        if (arr[0] == arr[1]) {
//            return arr[arr.length - 1];
//        }
//        return arr[0];

        //this looks way worse, but the execution time decreased by ~600ms
        if (arr[0] == arr[1]) {
            for (double number : arr) {
                if (number == arr[0]) {
                    continue;
                }
                return number;
            }
        }
        return arr[0] == arr[2] ? arr[1] : arr[0];
    }
}
