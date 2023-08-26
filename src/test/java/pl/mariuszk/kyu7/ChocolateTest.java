package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ChocolateTest {

    @CsvSource({
            "5, 5, 24",
            "1, 1, 0",
            "-1, -1, 0",
            "2, 1, 1",
            "3, 1, 2"
    })
    @ParameterizedTest
    void shouldReturnNumberOfBreaks(int n, int m, int expectedResult) {
        assertThat(Chocolate.breakChocolate(n, m)).isEqualTo(expectedResult);
    }
}