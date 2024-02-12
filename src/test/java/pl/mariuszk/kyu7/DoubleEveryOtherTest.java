package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DoubleEveryOtherTest {

    @MethodSource
    @ParameterizedTest
    void shouldDoubleEveryOtherDigit(int[] input, int[] expectedResult) {
        assertThat(DoubleEveryOther.doubleEveryOther(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldDoubleEveryOtherDigit() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4}, new int[]{1, 4, 3, 8}),
                arguments(new int[]{1, 19, 6, 2, 12, -3}, new int[]{1, 38, 6, 4, 12, -6}),
                arguments(new int[]{-1000, 1653, 210, 0, 1}, new int[]{-1000, 3306, 210, 0, 1})
        );
    }
}