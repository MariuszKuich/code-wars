package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StringSplitTest {

    @MethodSource
    @ParameterizedTest
    void shouldSplitStringLettersIntoPairs(String input, String[] expectedResult) {
        assertThat(StringSplit.solution(input)).isEqualTo(expectedResult);
    }

    static Stream<Arguments> shouldSplitStringLettersIntoPairs() {
        return Stream.of(
          arguments("abcdef", new String[] { "ab", "cd", "ef" }),
          arguments("HelloWorld", new String[] { "He", "ll", "oW", "or", "ld" }),
          arguments("abcde", new String[] { "ab", "cd", "e_" }),
          arguments("LovePizza", new String[] { "Lo", "ve", "Pi", "zz", "a_" })
        );
    }
}