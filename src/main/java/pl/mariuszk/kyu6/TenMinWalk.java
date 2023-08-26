package pl.mariuszk.kyu6;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        // I could use only two variables: one for going up/down, one for going left/right.
        // Variables could be incremented when going up/right and decremented when going down/left.
        int nCount = 0;
        int sCount = 0;
        int eCount = 0;
        int wCount = 0;

        for (char elem : walk) {
            switch (elem) {
                case 'n' -> nCount++;
                case 's' -> sCount++;
                case 'e' -> eCount++;
                case 'w' -> wCount++;
            }
        }

        return nCount == sCount && eCount == wCount;
    }
}
