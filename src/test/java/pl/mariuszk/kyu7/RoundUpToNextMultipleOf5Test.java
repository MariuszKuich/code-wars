package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RoundUpToNextMultipleOf5Test {

    @CsvSource(textBlock = """
            0, 0
            1, 5
            3, 5
            5, 5
            7, 10,
            39, 40
            12, 15
            21, 25
            30, 30
            -2, 0
            -5, -5
            -7, -5
            """)
    @ParameterizedTest
    void shouldRoundNumberToNextMultipleOfFive(int input, int expectedResult) {
        assertThat(RoundUpToNextMultipleOf5.roundToNext5(input)).isEqualTo(expectedResult);
    }
}