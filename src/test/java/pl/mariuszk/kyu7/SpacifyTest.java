package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SpacifyTest {

    @CsvSource(textBlock = """
            hello world, h e l l o   w o r l d
            12345, 1 2 3 4 5
            """)
    @ParameterizedTest
    void shouldInsertSpacesBetweenLetters(String input, String expectedResult) {
        assertThat(Spacify.spacify(input)).isEqualTo(expectedResult);
    }
}