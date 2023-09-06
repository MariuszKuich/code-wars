package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MissingLetterTest {

    @MethodSource
    @ParameterizedTest
    void shouldFindMissingLetter(char[] input, char expectedResult) {
        assertThat(MissingLetter.findMissingLetter(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldFindMissingLetter() {
        return Stream.of(
                arguments(new char[]{'a', 'b', 'c', 'd', 'f'}, 'e'),
                arguments(new char[]{'O', 'Q', 'R', 'S'}, 'P'),
                arguments(new char[]{'D', 'F', 'G'}, 'E'),
                arguments(new char[]{'h', 'i', 'j', 'l', 'm', 'n'}, 'k')
        );
    }
}