package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SpinWordsTest {

    private final SpinWords spinWords = new SpinWords();

    @CsvSource({
            "Welcome, emocleW",
            "Hey fellow warriors, Hey wollef sroirraw",
            "This is a test, This is a test",
            "This is another test, This is rehtona test"
    })
    @ParameterizedTest
    void shouldReverseFiveOrMoreLetterWords(String sentence, String expectedResult) {
        assertThat(spinWords.spinWords(sentence)).isEqualTo(expectedResult);
    }
}