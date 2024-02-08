package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersInStringsTest {

    @CsvSource(textBlock = """
            2ti9iei7qhr5, 9
            gh12cdy695m1, 695
            lu1j8qbbb85, 85
            185lu1j8qbbb85, 185
            """)
    @ParameterizedTest
    void shouldReturnLargestNumberFromString(String input, int expectedResult) {
        assertThat(NumbersInStrings.solve(input)).isEqualTo(expectedResult);
    }
}