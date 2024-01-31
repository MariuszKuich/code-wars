package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfSequenceTest {

    @CsvSource(textBlock = """
            2, 6, 2, 12
            1, 5, 1, 15
            1, 5, 3, 5
            0, 15, 3, 45
            16, 15, 3, 0
            """)
    @ParameterizedTest
    void shouldReturnSumOfSequence(int start, int end, int step, int expectedResult) {
        assertThat(SumOfSequence.sequenceSum(start, end, step)).isEqualTo(expectedResult);
    }
}