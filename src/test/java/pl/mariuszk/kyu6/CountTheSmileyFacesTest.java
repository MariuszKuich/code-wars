package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountTheSmileyFacesTest {

    @MethodSource
    @ParameterizedTest
    void shouldCountSmileyFaces(List<String> faces, int expectedResult) {
        assertThat(CountTheSmileyFaces.countSmileys(faces)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldCountSmileyFaces() {
        return Stream.of(
                arguments(List.of(":)", ":D", ":-}", ":-()"), 2),
                arguments(List.of(":)", "XD", ":0}", "x:-", "):-", "D:"), 1),
                arguments(List.of(":)", ":D", "X-}", "xo)", ":X", ":-3", ":3"), 2),
                arguments(List.of(":)", ":)", "x-]", ":ox", ";-(", ";-)", ";~(", ":~D"), 4)
        );
    }
}