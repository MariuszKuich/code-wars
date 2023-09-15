package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class HighestScoringWordTest {

    @CsvSource({
            "man i need a taxi up to ubud, taxi",
            "what time are we climbing up to the volcano, volcano",
            "take me to semynak, semynak",
            "aa b, aa",
            "b aa, b",
            "bb d, bb",
            "d bb, d",
            "aaa b, aaa",
    })
    @ParameterizedTest
    void shouldReturnWordWithTheHighestScore(String input, String expectedResult) {
        assertThat(HighestScoringWord.high(input)).isEqualTo(expectedResult);
    }
}