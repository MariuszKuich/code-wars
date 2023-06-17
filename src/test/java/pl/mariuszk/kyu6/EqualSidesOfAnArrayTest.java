package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class EqualSidesOfAnArrayTest {

    @ParameterizedTest
    @MethodSource
    void shouldReturnIndexAtWhichArrayHasEqualSides(int [] input, int expectedResult) {
        assertThat(EqualSidesOfAnArray.findEvenIndex(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnIndexAtWhichArrayHasEqualSides() {
        return Stream.of(
                arguments(new int[] {1,2,3,4,3,2,1}, 3),
                arguments(new int[] {1,100,50,-51,1,1}, 1),
                arguments(new int[] {1,2,3,4,5,6}, -1),
                arguments(new int[] {20,10,30,10,10,15,35}, 3),
                arguments(new int[] {-8505, -5130, 1926, -9026}, -1),
                arguments(new int[] {2824, 1774, -1490, -9084, -9696, 23094}, 1),
                arguments(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}, 6),
                arguments(new int[] {20,10,-80,10,10,15,35}, 0)
        );
    }
}