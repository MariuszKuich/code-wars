package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicateWordsTest {

    @CsvSource(textBlock = """
            alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta, alpha beta gamma delta
            my cat is my cat fat, my cat is fat
            test test test test, test
            """)
    @ParameterizedTest
    void shouldRemoveDuplicateWords(String input, String expectedResult) {
        assertThat(RemoveDuplicateWords.removeDuplicateWords(input)).isEqualTo(expectedResult);
    }
}