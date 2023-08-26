package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortTheOddTest {

    @MethodSource
    @ParameterizedTest
    void shouldSortOddNumbers(int[] input, int[] expectedResult) {
        assertThat(SortTheOdd.sortArray(input)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> shouldSortOddNumbers() {
        return Stream.of(
                arguments(new int[] { 5, 3, 2, 8, 1, 4 }, new int[] { 1, 3, 2, 8, 5, 4 }),
                arguments(new int[] { 5, 3, 1, 8, 0 }, new int[] { 1, 3, 5, 8, 0 }),
                arguments(new int[] {}, new int[] {}),
                arguments(new int[] { 7, 1 }, new int[] { 1, 7 }),
                arguments(new int[] { 5, 8, 6, 3, 4 }, new int[] { 3, 8, 6, 5, 4 }),
                arguments(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, new int[] { 1, 8, 3, 6, 5, 4, 7, 2, 9, 0 })
        );
    }
}