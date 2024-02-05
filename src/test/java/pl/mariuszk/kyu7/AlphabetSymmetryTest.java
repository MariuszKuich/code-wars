package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AlphabetSymmetryTest {

    @MethodSource("input")
    @ParameterizedTest
    public void shouldCountLettersWithPositionsFromAlphabet(String[] input, int[] expectedResult) {
        assertThat(AlphabetSymmetry.solve(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(new String[]{"abode", "ABc", "xyzD"}, new int[]{4, 3, 1}),
                arguments(new String[]{"abide", "ABc", "xyz"}, new int[]{4, 3, 0}),
                arguments(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}, new int[]{6, 5, 7}),
                arguments(new String[]{"encode", "abc", "xyzD", "ABmD"}, new int[]{1, 3, 1, 3})
        );
    }
}