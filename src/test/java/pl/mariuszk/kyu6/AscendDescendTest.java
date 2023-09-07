package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AscendDescendTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldCreateStringOfGivenLengthContainingSequenceOfNumbers(int length, int minimum,
                                                                    int maximum, String expectedResult) {
        assertThat(AscendDescend.ascendDescend(length, minimum, maximum)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(5, 1, 3, "12321"),
                arguments(14, 0, 2, "01210121012101"),
                arguments(0, 1, 3, ""),
                arguments(5, 4, 1, ""),
                arguments(10, -5, -3, "-5-4-3-4-5"),
                arguments(7, -5, -3, "-5-4-3-"),
                arguments(5, 2, 2, "22222")
        );
    }
}