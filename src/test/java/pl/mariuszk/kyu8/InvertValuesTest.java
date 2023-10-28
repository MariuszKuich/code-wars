package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class InvertValuesTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldInvertNumbers(int[] input, int[] expectedResult) {
        assertThat(InvertValues.invert(input)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5}),
                arguments(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5}),
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{0}, new int[]{0})
        );
    }
}