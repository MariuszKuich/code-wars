package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ArrayDiffTest {

    @ParameterizedTest
    @MethodSource(value = "arraysSource")
    void shouldSubtractSecondArrayFromTheFirstOne(int[] array1, int[] array2, int[] expectedResult) {
        assertThat(ArrayDiff.arrayDiff(array1, array2)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> arraysSource() {
        return Stream.of(
                arguments(new int[]{1, 2}, new int[]{1}, new int[]{2}),
                arguments(new int[]{1, 2, 2}, new int[]{1}, new int[]{2, 2}),
                arguments(new int[]{1, 2, 2}, new int[]{2}, new int[]{1}),
                arguments(new int[]{1, 2, 2}, new int[]{}, new int[]{1, 2, 2}),
                arguments(new int[]{}, new int[]{1, 2}, new int[]{})
        );
    }
}