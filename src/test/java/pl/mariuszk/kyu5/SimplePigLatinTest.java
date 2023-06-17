package pl.mariuszk.kyu5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SimplePigLatinTest {

    @ParameterizedTest
    @MethodSource(value = "pigLatinSource")
    void shouldTransformWordsAccordingToInstructions(String input, String expectedResult) {
        assertThat(SimplePigLatin.pigIt(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> pigLatinSource() {
        return Stream.of(
                arguments("Pig latin is cool", "igPay atinlay siay oolcay"),
                arguments("This is my string", "hisTay siay ymay tringsay"),
                arguments("Pig latin is cool", "igPay atinlay siay oolcay"),
                arguments("Hello world !", "elloHay orldway !")
        );
    }
}