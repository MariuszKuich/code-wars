package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WhoLikesItTest {

    @ParameterizedTest
    @MethodSource
    void shouldReturnDisplayTextAccordingToNamesInput(String[] names, String expectedResult) {
        assertThat(WhoLikesIt.whoLikesIt(names)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnDisplayTextAccordingToNamesInput() {
        return Stream.of(
                arguments(new String[] {}, "no one likes this"),
                arguments(new String[] {"Peter"}, "Peter likes this"),
                arguments(new String[] {"Jacob", "Alex"}, "Jacob and Alex like this"),
                arguments(new String[] {"Max", "John", "Mark"}, "Max, John and Mark like this"),
                arguments(new String[] {"Alex", "Jacob", "Mark", "Max"}, "Alex, Jacob and 2 others like this")
        );
    }
}