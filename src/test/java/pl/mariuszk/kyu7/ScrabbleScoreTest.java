package pl.mariuszk.kyu7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScrabbleScoreTest {

    @CsvSource(textBlock = """
            '', 0
            STREET, 6
            st re et, 6
            ca bba g  e, 14
            """)
    @ParameterizedTest
    void shouldCalculateScrabbleScore(String word, int expectedScore) {
        Assertions.assertThat(ScrabbleScore.scrabbleScore(word)).isEqualTo(expectedScore);
    }
}