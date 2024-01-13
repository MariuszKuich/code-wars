package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumProductTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldReturnMaximumProductFromMultiplyingTwoAdjacentNumbers(int[] input, int expectedResult) {
        assertThat(new MaximumProduct().adjacentElementsProduct(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(new int[]{5, 8}, 40),
                arguments(new int[]{1, 2, 3}, 6),
                arguments(new int[]{1, 5, 10, 9}, 90),
                arguments(new int[]{4, 12, 3, 1, 5}, 48),
                arguments(new int[]{5, 1, 2, 3, 1, 4}, 6),
                arguments(new int[]{3, 6, -2, -5, 7, 3}, 21),
                arguments(new int[]{9, 5, 10, 2, 24, -1, -48}, 50),
                arguments(new int[]{5, 6, -4, 2, 3, 2, -23}, 30),
                arguments(new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921}, -14),
                arguments(new int[]{5, 1, 2, 3, 1, 4}, 6),
                arguments(new int[]{1, 0, 1, 0, 1000}, 0),
                arguments(new int[]{1, 2, 3, 0}, 6)
        );
    }
}