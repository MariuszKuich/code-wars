package pl.mariuszk.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class EnoughIsEnoughTest {

    @MethodSource
    @ParameterizedTest
    void deleteNthTest(int[] elements, int maxOccurrences, int[] expectedResult) {
        Assertions.assertThat(EnoughIsEnough.deleteNth(elements, maxOccurrences)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> deleteNthTest() {
        return Stream.of(
                Arguments.of(new int[]{20, 37, 20, 21}, 1, new int[]{20, 37, 21}),
                Arguments.of(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3, new int[]{1, 1, 3, 3, 7, 2, 2, 2}),
                Arguments.of(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3, new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5}),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 5, new int[]{1, 1, 1, 1, 1}),
                Arguments.of(new int[]{}, 5, new int[]{})
        );
    }
}