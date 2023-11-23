package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfPeopleInTheBusTest {

    @MethodSource("input")
    @ParameterizedTest
    public void shouldReturnNumberOfPassengersAfterLastStop(List<int[]> stops, int expectedResult) {
        assertThat(NumberOfPeopleInTheBus.countPassengers(stops)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(List.of(new int[]{10, 0}, new int[]{3, 5}, new int[]{2, 5}), 5),
                arguments(List.of(new int[]{0, 0}, new int[]{0, 0}), 0),
                arguments(List.of(new int[]{15, 0}, new int[]{5, 15}, new int[]{0, 5}), 0),
                arguments(List.of(new int[]{3, 0}, new int[]{5, 2}, new int[]{8, 4}, new int[]{1, 1}), 10)
        );
    }
}