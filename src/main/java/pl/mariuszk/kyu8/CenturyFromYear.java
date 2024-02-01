package pl.mariuszk.kyu8;

public class CenturyFromYear {

    public static int century(int number) {
        return (int) Math.ceil(number / 100.0);
    }
}
