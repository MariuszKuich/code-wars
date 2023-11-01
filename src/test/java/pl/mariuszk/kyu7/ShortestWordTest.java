package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestWordTest {

    @CsvSource(textBlock = """
            bitcoin take over the world maybe who knows perhaps, 3
            turns out random test cases are easier than writing out basic ones, 3
            Let's travel abroad shall we, 2
            """)
    @ParameterizedTest
    void shouldFindShortestWordLength(String input, int expectedResult) {
        assertThat(ShortestWord.findShort(input)).isEqualTo(expectedResult);
    }
}