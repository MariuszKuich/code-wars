package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReversedDigitsArrayTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldConvertNumberToReversedArrayOfDigits(long number, int[] expectedResult) {
        assertThat(ReversedDigitsArray.digitize(number)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(35231, new int[]{1, 3, 2, 5, 3}),
                arguments(0, new int[]{0}),
                arguments(999, new int[]{9, 9, 9})
        );
    }
}