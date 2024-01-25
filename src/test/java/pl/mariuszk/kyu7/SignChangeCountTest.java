package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SignChangeCountTest {

    @MethodSource
    @ParameterizedTest
    void shouldCountNumberOfSignChanges(int[] input, int expectedResult) {
        assertThat(SignChangeCount.signChange(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldCountNumberOfSignChanges() {
        return Stream.of(
                arguments(new int[] {1, 3, 4, 5}, 0),
                arguments(new int[] {1, -3, -4, 0, 5}, 2),
                arguments(new int[] {}, 0),
                arguments(new int[] {-47, 84, -30, -11, -5, 74, 77}, 3)
        );
    }
}