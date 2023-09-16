package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class IsogramTest {

    @MethodSource
    @ParameterizedTest
    void shouldDetermineIfWordIsIsogram(String word, boolean expectedResult) {
        assertThat(Isogram.isIsogram(word)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldDetermineIfWordIsIsogram() {
        return Stream.of(
                arguments("Dermatoglyphics", true),
                arguments("isogram", true),
                arguments("thumbscrewjapingly", true),
                arguments("", true),
                arguments("a", true),
                arguments("moose", false),
                arguments("isIsogram", false),
                arguments("aba", false),
                arguments("moOse", false)
        );
    }
}