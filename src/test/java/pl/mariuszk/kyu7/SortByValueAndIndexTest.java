package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortByValueAndIndexTest {

    @MethodSource
    @ParameterizedTest
    void shouldSortArrayByProductOfValueAndIndex(int[] input, int[] expectedResult) {
        assertThat(SortByValueAndIndex.sortByValueAndIndex(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldSortArrayByProductOfValueAndIndex() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
                arguments(new int[]{23, 2, 3, 4, 5}, new int[]{2, 3, 4, 23, 5}),
                arguments(new int[]{26, 2, 3, 4, 5}, new int[]{2, 3, 4, 5, 26}),
                arguments(new int[]{9, 5, 1, 4, 3}, new int[]{1, 9, 5, 3, 4})
        );
    }
}