package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MakeTheDeadfishSwimTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldDecodeDeadfishCode(String input, int[] expectedResult) {
        assertThat(MakeTheDeadfishSwim.parse(input)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments("iiisdoso", new int[]{8, 64}),
                arguments("iiisdosodddddiso", new int[]{8, 64, 3600})
        );
    }
}