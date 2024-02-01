package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GetTheMiddleCharacterTest {

    @CsvSource(textBlock = """
            test, es
            middle, dd
            testing, t
            A, A
            """)
    @ParameterizedTest
    void shouldReturnMiddleCharacters(String word, String expectedResult) {
        assertThat(GetTheMiddleCharacter.getMiddle(word)).isEqualTo(expectedResult);
    }
}