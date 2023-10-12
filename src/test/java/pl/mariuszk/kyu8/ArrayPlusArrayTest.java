package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ArrayPlusArrayTest {

    @MethodSource
    @ParameterizedTest
    void shouldSumArraysElements(int[] arr1, int[] arr2, int expectedResult) {
        assertThat(ArrayPlusArray.arrayPlusArray(arr1, arr2)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldSumArraysElements() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 21),
                arguments(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}, -21),
                arguments(new int[]{0, 0, 0}, new int[]{4, 5, 6}, 15),
                arguments(new int[]{100, 200, 300}, new int[]{400, 500, 600}, 2100)
        );
    }
}