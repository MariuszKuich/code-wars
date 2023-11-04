package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearsTest {

    @CsvSource(textBlock = """
            2020, true
            2000, true
            2015, false
            2100, false
            """)
    @ParameterizedTest
    void shouldDetermineIfYearIsLeapYear(int year, boolean expectedResult) {
        assertThat(LeapYears.isLeapYear(year)).isEqualTo(expectedResult);
    }
}