package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ListFilteringTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldFilterOutStrings(List<Object> input, List<Object> expectedResult) {
        assertThat(ListFiltering.filterList(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(List.of(1, 2, "a", "b"), List.of(1, 2)),
                arguments(List.of(1, "a", "b", 0, 15), List.of(1, 0, 15)),
                arguments(List.of(1, 2, "aasf", "1", "123", 123), List.of(1, 2, 123))
        );
    }
}