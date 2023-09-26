package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BreakCamelCaseTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldBreakCamelCaseUsingSpaceBetweenWords(String input, String expectedResult) {
        assertThat(BreakCamelCase.camelCase(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments("camelCasing", "camel Casing"),
                arguments("camelCasingTest", "camel Casing Test"),
                arguments("camelcasingtest", "camelcasingtest"),
                arguments("identifier", "identifier"),
                arguments("camelCamelCamel", "camel Camel Camel"),
                arguments("", "")
        );
    }
}