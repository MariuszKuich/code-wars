package pl.mariuszk.kyu7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class HighestProfitWinsTest {

    @MethodSource
    @ParameterizedTest
    void shouldReturnMinimumAndMaximum(int[] input, int[] expectedResult) {
        Assertions.assertThat(HighestProfitWins.minMax(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnMinimumAndMaximum() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 5}),
                arguments(new int[]{2334454, 5}, new int[]{5, 2334454}),
                arguments(new int[]{1}, new int[]{1, 1})
        );
    }
}