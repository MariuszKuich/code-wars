package pl.mariuszk.kyu4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StripCommentsTest {

    @MethodSource
    @ParameterizedTest
    void shouldStripCommentsFromString(String input, String[] commentSymbols, String expectedResult) {
        assertThat(StripComments.stripComments(input, commentSymbols)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldStripCommentsFromString() {
        return Stream.of(
                arguments(
                        "apples, pears # and bananas\ngrapes\nbananas !apples",
                        new String[]{"#", "!"},
                        "apples, pears\ngrapes\nbananas"
                ),
                arguments(
                        "apples, pears # and bananas\ngrapes\nbananas #apples",
                        new String[]{"#"},
                        "apples, pears\ngrapes\nbananas"
                ),
                arguments(
                        "a #b\nc\nd $e f g",
                        new String[]{"#", "$"},
                        "a\nc\nd"
                )
        );
    }
}