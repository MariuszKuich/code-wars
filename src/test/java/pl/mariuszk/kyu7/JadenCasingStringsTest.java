package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class JadenCasingStringsTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldConvertStringsToJadenSmithCase(String input, String expectedResult) {
        //given
        JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();

        //when
        String result = jadenCasingStrings.toJadenCase(input);

        //expecting
        assertThat(result).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments("How can mirrors be real if our eyes aren't real", "How Can Mirrors Be Real If Our Eyes Aren't Real"),
                arguments("most trees are blue", "Most Trees Are Blue"),
                arguments("find a way", "Find A Way"),
                arguments(null, null),
                arguments("", null)
        );
    }
}