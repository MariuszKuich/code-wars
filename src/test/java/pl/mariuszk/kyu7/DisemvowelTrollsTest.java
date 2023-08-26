package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DisemvowelTrollsTest {

    @MethodSource("testInput")
    @ParameterizedTest
    void shouldDisemvowelComment(String input, String expectedResult) {
        assertThat(DisemvowelTrolls.disemvowel(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
                arguments("This website is for losers LOL!", "Ths wbst s fr lsrs LL!"),
                arguments("No offense but,\nYour writing is among the worst I've ever read",
                        "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd"),
                arguments("What are you, a communist?", "Wht r y,  cmmnst?")
        );
    }
}