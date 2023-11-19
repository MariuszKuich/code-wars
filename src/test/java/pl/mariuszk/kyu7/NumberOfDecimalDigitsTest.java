package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfDecimalDigitsTest {

    @CsvSource(textBlock = """
            5, 1
            12345, 5
            9876543210, 10
            """)
    @ParameterizedTest
    void shouldReturnNumberOfDigits(long input, int expectedResult) {
        assertThat(NumberOfDecimalDigits.digits(input)).isEqualTo(expectedResult);
    }
}