package pl.mariuszk.kyu7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class AgeInDaysTest {

    @Test
    public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
        // given
        LocalDate birthday = LocalDate.now().minusDays(2);

        // when
        String result = AgeInDays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth());

        // then
        assertThat(result).isEqualTo("You are 2 days old");
    }

    @Test
    public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
        // given
        LocalDate birthday = LocalDate.now().minusYears(1);

        // when
        String result = AgeInDays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth());

        // then
        if (LocalDate.now().isLeapYear()) {
            assertThat(result).isEqualTo("You are 366 days old");
        } else {
            assertThat(result).isEqualTo("You are 365 days old");
        }
    }
}