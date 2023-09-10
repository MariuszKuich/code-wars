package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CountingDuplicatesTest {

    @CsvSource({
            "abcde, 0",
            "aabbcde, 2",
            "aabBcde, 2",
            "indivisibility, 1",
            "Indivisibilities, 2",
            "aA11, 2",
            "ABBA, 2",
    })
    @ParameterizedTest
    void shouldCountDuplicateCharactersCaseInsensitive(String text, int expectedResult) {
        assertThat(CountingDuplicates.duplicateCount(text)).isEqualTo(expectedResult);
    }
}