package pl.mariuszk.kyu8;

import java.util.List;

public class YouOnlyNeedOne {

    public static boolean check(Object[] a, Object x) {
        return List.of(a).contains(x);
    }
}
