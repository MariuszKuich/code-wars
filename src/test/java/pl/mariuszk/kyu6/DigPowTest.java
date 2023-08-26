package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DigPowTest {

    @CsvSource({
            "89, 1, 1",
            "92, 1, -1",
            "46288, 3, 51",
            "695, 2, 2"
    })
    @ParameterizedTest
    void shouldDetermineIfKExists(int n, int p, int expectedResult) {
        assertThat(DigPow.digPow(n, p)).isEqualTo(expectedResult);
    }
}