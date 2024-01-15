package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class InsertDashesTest {

    @CsvSource(textBlock = """
            454793, 4547-9-3
            123456, 123456
            1003567, 1003-567
            """)
    @ParameterizedTest
    void shouldInsertDashesBetweenEachTwoOddDigits(int num, String expectedResult) {
        assertThat(InsertDashes.insertDash(num)).isEqualTo(expectedResult);
    }
}