package pl.mariuszk.kyu8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountPosSumNegTest {

    @MethodSource
    @ParameterizedTest
    void shouldCountPositivesAndSumNegatives(int[] input, int[] expectedResult) {
        Assertions.assertThat(CountPosSumNeg.countPositivesSumNegatives(input)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> shouldCountPositivesAndSumNegatives() {
        return Stream.of(
                arguments(null, new int[]{}),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}),
                arguments(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[]{8, -50})
        );
    }
}