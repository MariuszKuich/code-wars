package pl.mariuszk.kyu7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AgeInDays {

    public static String ageInDays(int year, int month, int day) {
        LocalDateTime birthDateTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(0, 0));
        // ChronoUnits.DAYS.between() could be used instead
        long days = Duration.between(birthDateTime, LocalDateTime.now()).toDays();
        return String.format("You are %d days old", days);
    }
}
