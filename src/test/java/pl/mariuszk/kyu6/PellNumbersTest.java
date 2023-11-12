package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class PellNumbersTest {

    @CsvSource(textBlock = """
            1, 1
            2, 2
            3, 5
            4, 12
            """)
    @ParameterizedTest
    void shouldReturnPellValue(int n, BigInteger expectedResult) {
        assertThat(PellNumbers.pell(n)).isEqualTo(expectedResult);
    }
}