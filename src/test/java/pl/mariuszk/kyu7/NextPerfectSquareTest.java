package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NextPerfectSquareTest {

    @CsvSource(textBlock = """
            121, 144
            625, 676
            114, -1
            """)
    @ParameterizedTest
    void shouldFindNextPerfectSquare(int input, int expectedResult) {
        assertThat(NextPerfectSquare.findNextSquare(input)).isEqualTo(expectedResult);
    }
}