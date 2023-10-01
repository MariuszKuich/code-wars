package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DoubleCharTest {

    @MethodSource
    @ParameterizedTest
    void shouldDoubleStringLetters(String input, String expectedResult) {
        assertThat(DoubleChar.doubleChar(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldDoubleStringLetters() {
        return Stream.of(
                arguments("String", "SSttrriinngg"),
                arguments("Hello World", "HHeelllloo  WWoorrlldd"),
                arguments("1234!_ ", "11223344!!__  ")
        );
    }
}