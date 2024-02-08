package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ShiftLeftTest {

    @CsvSource(textBlock = """
            test, west, 2
            test, yes, 7
            b, ab, 1
            '', '', 0
            """)
    @ParameterizedTest
    void shouldReturnNumberOfMovesToMakeStringsEqual(String a, String b, int expectedResult) {
        assertThat(ShiftLeft.shiftLeft(a, b)).isEqualTo(expectedResult);
    }
}