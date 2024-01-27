package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class HighestAndLowestTest {

    @CsvSource({
            "8 3 -5 42 -1 0 0 -9 4 7 4 -4, 42 -9",
            "1 2 3 4 5, 5 1",
            "1 2 -3 4 5, 5 -3",
            "1 9 3 4 -5, 9 -5"
    })
    @ParameterizedTest
    void shouldReturnHighestAndLowestNumber(String input, String expectedResult) {
        assertThat(HighestAndLowest.highAndLow(input)).isEqualTo(expectedResult);
    }
}