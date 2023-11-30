package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NthSeriesTest {

    @CsvSource(textBlock = """
            0, 0.00
            1, 1.00
            2, 1.25
            5, 1.57
            9, 1.77
            15, 1.94
            """)
    @ParameterizedTest
    void shouldReturnSumOfFirstNthTermOfSeries(int n, String expectedResult) {
        assertThat(NthSeries.seriesSum(n)).isEqualTo(expectedResult);
    }
}