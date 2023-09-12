package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SentenceSmashTest {

    @MethodSource
    @ParameterizedTest
    void shouldCombineWordsIntoASentence(String expectedResult, String... input) {
        assertThat(SentenceSmash.smash(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldCombineWordsIntoASentence() {
        return Stream.of(
                arguments("Bilal Djaghout", new String[]{"Bilal", "Djaghout"}),
                arguments("", new String[]{}),
                arguments("Bilal", new String[]{"Bilal"}),
                arguments("Hello world this is great", new String[]{"Hello", "world", "this", "is", "great"})
        );
    }
}