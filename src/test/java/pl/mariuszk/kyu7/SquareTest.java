package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @CsvSource({
            "-1, false",
            "0, true",
            "3, false",
            "4, true",
            "25, true",
            "26, false"
    })
    @ParameterizedTest
    void shouldDetermineIfNumberIsSquare(int number, boolean expectedResult) {
        assertThat(Square.isSquare(number)).isEqualTo(expectedResult);
    }
}