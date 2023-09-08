package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindUniqueNumberTest {

    @MethodSource
    @ParameterizedTest
    void shouldFindUniqueNumber(double[] input, double expectedResult) {
        assertThat(FindUniqueNumber.findUniq(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldFindUniqueNumber() {
        return Stream.of(
                arguments(new double[]{0, 1, 0}, 1),
                arguments(new double[]{1, 1, 1, 2, 1, 1}, 2),
                arguments(new double[]{0, 0, 0.55, 0, 0}, 0.55),
                arguments(new double[]{4, 3, 3, 3, 3, 3, 3, 3, 3, 3}, 4),
                arguments(new double[]{1, 1, 1, 1, 1, 1, 1, 1, 8.908, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 8.908)
        );
    }
}