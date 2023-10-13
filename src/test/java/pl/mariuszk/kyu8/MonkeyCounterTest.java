package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MonkeyCounterTest {

    @MethodSource
    @ParameterizedTest
    void shouldCreateArrayFrom1ToN(int input, int[] expectedResult) {
        assertThat(MonkeyCounter.monkeyCount(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldCreateArrayFrom1ToN() {
        return Stream.of(
                arguments(5, new int[]{1, 2, 3, 4, 5}),
                arguments(3, new int[]{1, 2, 3}),
                arguments(9, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
                arguments(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                arguments(20, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20})
        );
    }
}