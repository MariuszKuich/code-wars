package pl.mariuszk.kyu7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLongerTest {

    @CsvSource(textBlock = """
            first, abcde, abcdetsrifabcde
            hello, bau, bauollehbau
            abcde, fghi, fghiedcbafghi
            """)
    @ParameterizedTest
    void shouldUseShorterStringAsPrefixAndPostfixAndReverseLongerString(String s1, String s2, String expectedResult) {
        assertThat(ReverseLonger.shorterReverseLonger(s1, s2)).isEqualTo(expectedResult);
    }

    @Test
    void shouldUseSecondStringAsPrefixAndPostfixAndReverseFirstString() {
        assertThat(ReverseLonger.shorterReverseLonger("abcde", "fghi")).isEqualTo("fghiedcbafghi");
    }
}