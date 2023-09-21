package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GrassHopperTest {

    @CsvSource({
            "1, 1",
            "8, 36",
            "2, 3"
    })
    @ParameterizedTest
    void shouldReturnSumOfNumbersFromOneToNum(int num, int expectedResult) {
        assertThat(GrassHopper.summation(num)).isEqualTo(expectedResult);
    }
}