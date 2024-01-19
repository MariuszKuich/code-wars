package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SmallestValueOfAnArrayTest {

    @MethodSource
    @ParameterizedTest
    void shouldFindSmallestValueOrIndexOfSmallestValue(int[] numbers, String toReturn, int expectedResult) {
        assertThat(SmallestValueOfAnArray.findSmallest(numbers, toReturn)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldFindSmallestValueOrIndexOfSmallestValue() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, "index", 0),
                arguments(new int[]{7, 12, 3, 2, 27}, "value", 2),
                arguments(new int[]{7, 12, 3, 2, 27}, "index", 3),
                arguments(new int[]{1, 2, 3, 4, 5}, "value", 1),
                arguments(new int[]{1, 2, 3, 4, 5}, "index", 0),
                arguments(new int[]{1}, "index", 0),
                arguments(new int[]{1}, "value", 1)
        );
    }
}