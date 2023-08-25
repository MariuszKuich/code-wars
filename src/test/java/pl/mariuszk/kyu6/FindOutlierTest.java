package pl.mariuszk.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindOutlierTest {

    @MethodSource("source")
    @ParameterizedTest
    void shouldFindOutlier(int[] integers, int expectedResult) {
        Assertions.assertThat(FindOutlier.find(integers)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 2, 6, 8, -10, 3 }, 3),
                arguments(new int[] { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 }, 206847684),
                arguments(new int[] { Integer.MAX_VALUE, 0, 1 }, 0),
                arguments(new int[] { 2, 4, 0, 100, 4, 11, 2602, 36 }, 11),
                arguments(new int[] { 160, 3, 1719, 19, 11, 13, -21 }, 160),
                arguments(new int[] { 3, 3, 3, 2 }, 2)
        );
    }
}