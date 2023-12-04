package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumOfArraySinglesTest {

    @MethodSource
    @ParameterizedTest
    void shouldReturnSumOfSingleDigits(int[] input, int expectedResult) {
        assertThat(SumOfArraySingles.repeats(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnSumOfSingleDigits() {
        return Stream.of(
                arguments(new int[]{4, 5, 7, 5, 4, 8}, 15),
                arguments(new int[]{9, 10, 19, 13, 19, 13}, 19),
                arguments(new int[]{16, 0, 11, 4, 8, 16, 0, 11}, 12)
        );
    }
}