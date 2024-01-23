package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseNumberTest {

    @CsvSource(textBlock = """
            123, 321
            -456, -654
            1000, 1
            5, 5
            """)
    @ParameterizedTest
    void shouldReverseNumber(int input, int expectedResult) {
        assertThat(ReverseNumber.reverse(input)).isEqualTo(expectedResult);
    }
}