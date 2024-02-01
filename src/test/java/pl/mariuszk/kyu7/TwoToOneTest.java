package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class TwoToOneTest {

    @CsvSource(textBlock = """
            aretheyhere, yestheyarehere, aehrsty
            loopingisfunbutdangerous, lessdangerousthancoding, abcdefghilnoprstu
            inmanylanguages, theresapairoffunctions, acefghilmnoprstuy
            xyaabbbccccdefww, xxxxyyyyabklmopq, abcdefklmopqwxy
            abcdefghijklmnopqrstuvwxyz, abcdefghijklmnopqrstuvwxyz, abcdefghijklmnopqrstuvwxyz
            """)
    @ParameterizedTest
    void shouldReturnConcatenatedSortedStringWithDistinctLetters(String s1, String s2, String expectedResult) {
        assertThat(TwoToOne.longest(s1, s2)).isEqualTo(expectedResult);
    }
}