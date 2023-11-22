package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class WordA10nTest {

    @CsvSource(textBlock = """
            internationalization, i18n
            elephant-rides are really fun!, e6t-r3s are r4y fun!
            internationalization internationalizationX, i18n i19X
            """)
    @ParameterizedTest
    void shouldCreateAbbreviationsOfWordsOfLength4OrGreater(String input, String expectedResult) {
        assertThat(new WordA10n().abbreviate(input)).isEqualTo(expectedResult);
    }
}