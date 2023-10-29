package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsTest {

    @CsvSource(textBlock = """
            The quick brown fox jumps over the lazy dog., ehT kciuq nworb xof spmuj revo eht yzal .god
            apple, elppa
            a b c d, a b c d
            double  spaced  words, elbuod  decaps  sdrow
            '    ', '    '
            """)
    @ParameterizedTest
    void shouldReverseWordsInString(String input, String expectedResult) {
        assertThat(ReverseWords.reverseWords(input)).isEqualTo(expectedResult);
    }
}