package pl.mariuszk.kyu7;

import java.time.LocalDate;

public class LeapYears {

    public static boolean isLeapYear(int year) {
        // java.time.Year could be used
        return LocalDate.of(year, 1, 1).isLeapYear();
    }
}
