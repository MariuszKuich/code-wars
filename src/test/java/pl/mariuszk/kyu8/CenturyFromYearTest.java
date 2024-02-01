package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CenturyFromYearTest {

    @CsvSource(textBlock = """
            1705, 18
            1900, 19
            1601, 17
            2000, 20
            89, 1
            2742, 28
            """)
    @ParameterizedTest
    void shouldReturnCenturyFromYear(int year, int expectedResult) {
        assertThat(CenturyFromYear.century(year)).isEqualTo(expectedResult);
    }
}