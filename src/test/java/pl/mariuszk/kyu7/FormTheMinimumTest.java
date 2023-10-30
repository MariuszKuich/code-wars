package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FormTheMinimumTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldReturnMinimumNumberWithoutDuplicates(int[] values, int expectedResult) {
        assertThat(FormTheMinimum.minValue(values)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(new int[]{1, 3, 1}, 13),
                arguments(new int[]{4, 7, 5, 7}, 457),
                arguments(new int[]{4, 8, 1, 4}, 148),
                arguments(new int[]{5, 7, 9, 5, 7}, 579),
                arguments(new int[]{6, 7, 8, 7, 6, 6}, 678)
        );
    }
}