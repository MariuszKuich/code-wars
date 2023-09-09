package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PersistentBuggerTest {

    @CsvSource({
            "39, 3",
            "4, 0",
            "25, 2",
            "999, 4"
    })
    @ParameterizedTest
    void shouldCalculateMultiplicativePersistence(int number, int expectedResult) {
        assertThat(PersistentBugger.persistence(number)).isEqualTo(expectedResult);
    }
}