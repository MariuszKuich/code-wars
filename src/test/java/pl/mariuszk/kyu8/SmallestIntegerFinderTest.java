package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SmallestIntegerFinderTest {

    @MethodSource
    @ParameterizedTest
    void shouldReturnSmallestInteger(int[] arr, int expectedResult) {
        assertThat(SmallestIntegerFinder.findSmallestInt(arr)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnSmallestInteger() {
        return Stream.of(
                arguments(new int[]{78, 56, 232, 12, 11, 43}, 11),
                arguments(new int[]{78, 56, -2, 12, 8, -33}, -33),
                arguments(new int[]{2, 2, 5}, 2),
                arguments(new int[]{6, 6, 6}, 6),
                arguments(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE}, Integer.MIN_VALUE)
        );
    }
}