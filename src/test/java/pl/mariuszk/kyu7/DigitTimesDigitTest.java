package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DigitTimesDigitTest {

    @ParameterizedTest
    @CsvSource({ "9119, 811181", "765, 493625", "0, 0", "6844, 36641616" })
    void shouldReturnSquaredConcatenatedNumbers(int input, int expectedResult) {
        //given
        DigitTimesDigit digitTimesDigit = new DigitTimesDigit();

        //when
        int result = digitTimesDigit.squareDigits(input);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}