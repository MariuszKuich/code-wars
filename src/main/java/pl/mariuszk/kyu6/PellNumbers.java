package pl.mariuszk.kyu6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PellNumbers {

    public static BigInteger pell(int n) {
        // recursive solution that unfortunately takes too long to execute
//        if (n == 1) {
//            return BigInteger.ONE;
//        }
//        if (n == 0) {
//            return BigInteger.ZERO;
//        }
//        return pell(n - 1).multiply(BigInteger.valueOf(2L)).add(pell(n - 2));

        // since I know the total number of elements, I could use an array
        List<BigInteger> pellValues = new ArrayList<>();
        pellValues.add(BigInteger.ZERO);
        pellValues.add(BigInteger.ONE);

        for (int i = 2; i <= n; i++) {
            BigInteger value = pellValues.get(i - 1).multiply(BigInteger.valueOf(2L)).add(pellValues.get(i - 2));
            pellValues.add(value);
        }

        return pellValues.get(n);
    }
}
