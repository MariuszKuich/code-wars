package pl.mariuszk.kyu8;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumWithoutHighestLowestTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldSumElementsWithoutHighestAndLowestValues(int[] input, int expectedResult) {
        assertThat(SumWithoutHighestLowest.sum(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(new int[]{6, 2, 1, 8, 10}, 16),
                arguments(new int[]{1, 1, 11, 2, 3}, 6),
                arguments(null, 0),
                arguments(new int[]{}, 0),
                arguments(new int[]{5}, 0)
        );
    }
}