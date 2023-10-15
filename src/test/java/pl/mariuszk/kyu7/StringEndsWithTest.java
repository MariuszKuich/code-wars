package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringEndsWithTest {

    @CsvSource(textBlock = """
            samurai, ai, true
            sumo, omo, false
            ninja, ja, true
            sensei, i, true
            samurai, ra, false
            """)
    @ParameterizedTest
    void shouldDetermineIfStringEndsWith(String str, String ending, boolean expectedResult) {
        assertThat(StringEndsWith.solution(str, ending)).isEqualTo(expectedResult);
    }
}