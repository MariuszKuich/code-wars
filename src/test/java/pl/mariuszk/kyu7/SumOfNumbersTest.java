package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfNumbersTest {

    @CsvSource(textBlock = """
            0, -1, -1
            0, 1, 1
            1, 0, 1
            1, 2, 3
            1, 1, 1
            -1, 0, -1
            -1, 2, 2
            """)
    @ParameterizedTest
    void shouldReturnSumOfNumbersInRange(int a, int b, int expectedResult) {
        assertThat(new SumOfNumbers().getSum(a, b)).isEqualTo(expectedResult);
    }
}