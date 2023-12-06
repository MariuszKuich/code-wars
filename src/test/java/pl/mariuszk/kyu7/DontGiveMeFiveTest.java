package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DontGiveMeFiveTest {

    @CsvSource(textBlock = """
            1, 9, 8
            4, 17, 12
            -6, 0, 6
            """)
    @ParameterizedTest
    void shouldReturnCountOfNumbersWithoutFivesInRange(int start, int end, int expectedResult) {
        assertThat(DontGiveMeFive.dontGiveMeFive(start, end)).isEqualTo(expectedResult);
    }
}