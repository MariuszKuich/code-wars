package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StringArrayDuplicatesTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldRemoveConsecutiveDuplicateLettersFromStrings(String[] input, String[] expectedResult) {
        assertThat(StringArrayDuplicates.dup(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(
                        new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"},
                        new String[]{"codewars", "picaniny", "hubububo"}
                ),
                arguments(
                        new String[]{"abracadabra", "allottee", "assessee"},
                        new String[]{"abracadabra", "alote", "asese"}
                ),
                arguments(
                        new String[]{"kelless", "keenness"},
                        new String[]{"keles", "kenes"}
                )
        );
    }
}