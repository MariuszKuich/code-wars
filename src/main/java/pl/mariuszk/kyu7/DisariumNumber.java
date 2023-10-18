package pl.mariuszk.kyu7;

public class DisariumNumber {

    public static String disariumNumber(int number) {
        String num = String.valueOf(number);
        double digitsSum = 0;
        int i = 1;
        while (!num.isEmpty()) {
            int digit = Integer.parseInt(num.substring(0, 1));
            digitsSum += Math.pow(digit, i++);
            num = num.substring(1);
        }
        return (int) digitsSum == number ? "Disarium !!" : "Not !!";
    }
}
