package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AreWeAlternateTest {

    @CsvSource(textBlock = """
            amazon, true
            apple, false
            banana, true
            """)
    @ParameterizedTest
    void shouldCheckIfStringLettersAreAlternate(String word, boolean expectedResult) {
        assertThat(AreWeAlternate.isAlt(word)).isEqualTo(expectedResult);
    }
}