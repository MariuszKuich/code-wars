package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class TheOldSwitcherooTest {

    @CsvSource(textBlock = """
            this is my string, th3s 6s my str15ng
            Codewars is the best site in the world, C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld
            Tomorrow is going to be raining, T2m4rr7w 10s g1415ng t20 b23 r2627n29ng
            '', ''
            """)
    @ParameterizedTest
    void shouldTransformVowelsIntoIndexes(String input, String expectedResult) {
        assertThat(TheOldSwitcheroo.vowel2Index(input)).isEqualTo(expectedResult);
    }
}