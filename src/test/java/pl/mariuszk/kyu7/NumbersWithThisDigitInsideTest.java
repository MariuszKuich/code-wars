package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumbersWithThisDigitInsideTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldReturnCountSumAndProductOfNumbersFromRangeWithDigitInside(long rangeEndInclusive, long digit, long[] expectedResult) {
        assertThat(NumbersWithThisDigitInside.numbersWithDigitInside(rangeEndInclusive, digit)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments(5, 6, new long[]{0, 0, 0}),
                arguments(7, 6, new long[]{1, 6, 6}),
                arguments(11, 1, new long[]{3, 22, 110}),
                arguments(20, 0, new long[]{2, 30, 200}),
                arguments(44, 4, new long[]{9, 286, 5955146588160L})
        );
    }
}