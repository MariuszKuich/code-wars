package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DigitizeTest {

    @MethodSource
    @ParameterizedTest
    void shouldPutDigitsIntoArray(int number, int[] expectedResult) {
        assertThat(Digitize.digitize(number)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldPutDigitsIntoArray() {
        return Stream.of(
                arguments(123, new int[]{1, 2, 3}),
                arguments(1, new int[]{1}),
                arguments(0, new int[]{0}),
                arguments(1230, new int[]{1, 2, 3, 0}),
                arguments(8675309, new int[]{8, 6, 7, 5, 3, 0, 9})
        );
    }
}