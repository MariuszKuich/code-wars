package pl.mariuszk.kyu6;

import java.util.Arrays;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int checkoutNo) {
        // I gave up on this one, this solution is someone else's :P
        int[] checkouts = new int[checkoutNo];
        for (int customer : customers) {
            checkouts[0] += customer;
            Arrays.sort(checkouts);
        }
        return checkouts[checkoutNo - 1];
    }
}
