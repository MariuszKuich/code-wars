package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumConsecutivesTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldSumConsecutivesInList(List<Integer> input, List<Integer> expectedResult) {
        assertThat(SumConsecutives.sumConsecutives(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(List.of(1,4,4,4,0,4,3,3,1), List.of(1,12,0,4,6,1)),
                arguments(List.of(-5,-5,7,7,12,0), List.of(-10,14,12,0))
        );
    }
}