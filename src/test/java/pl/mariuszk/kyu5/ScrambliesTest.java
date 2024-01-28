package pl.mariuszk.kyu5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ScrambliesTest {

    @CsvSource(textBlock = """
            rkqodlw, world, true
            cedewaraaossoqqyt, codewars, true
            katas, steak, false
            scriptjavx ,javascript, false
            scriptingjava ,javascript, true
            scriptsjava, javascripts, true
            javscripts, javascript, false
            aabbcamaomsccdd, commas, true
            commas, commas, true
            sammoc, commas, true
            """)
    @ParameterizedTest
    void shouldCheckIfStr2CanBeCreatedWithLettersOfStr1_basicCases(String str1, String str2, boolean expectedResult) {
        assertThat(Scramblies.scramble(str1, str2)).isEqualTo(expectedResult);
    }

    @Test
    void shouldCheckIfStr2CanBeCreatedWithLettersOfStr1_largeCase() {
        // given
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        // expecting
        assertThat(Scramblies.scramble(s1, s2)).isTrue();
    }
}