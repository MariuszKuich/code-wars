package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WhichAreInTest {

    @ParameterizedTest
    @MethodSource
    void shouldReturnSortedSubstringsArray(String[] array1, String[] array2, String[] expectedResult) {
        assertThat(WhichAreIn.inArray(array1, array2)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> shouldReturnSortedSubstringsArray() {
        return Stream.of(
                arguments(
                        new String[] {"live", "arp", "strong"},
                        new String[] {"lively", "alive", "harp", "sharp", "armstrong"},
                        new String[] {"arp", "live", "strong"}
                ),
                arguments(
                        new String[] {"tarp", "mice", "bull"},
                        new String[] {"lively", "alive", "harp", "sharp", "armstrong"},
                        new String[0]
                )
        );
    }
}