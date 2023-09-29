package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DigitalRootTest {

    @CsvSource({
            "16, 7",
            "456, 6",
            "942, 6",
            "132189, 6",
            "493193, 2",
    })
    @ParameterizedTest
    void shouldCalculateDigitalRoot(int number, int expectedResult) {
        assertThat(DigitalRoot.digitalRoot(number)).isEqualTo(expectedResult);
    }
}