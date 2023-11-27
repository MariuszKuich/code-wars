package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SimplePrimeStreamingTest {

    @CsvSource(textBlock = """
            2, 2, 57
            10, 3, 192
            20, 9, 414347535
            30, 12, 616771737983
            40, 8, 83899710
            50, 6, 031071
            10000, 5, 02192
            20000, 5, 09334
            """)
    @ParameterizedTest
    void shouldReturnPrimeNumbersSequenceOfLengthBStartingFromA(int a, int b, String expectedResult) {
        assertThat(SimplePrimeStreaming.solve(a, b)).isEqualTo(expectedResult);
    }
}