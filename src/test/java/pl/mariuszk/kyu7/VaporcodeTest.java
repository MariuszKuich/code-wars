package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class VaporcodeTest {

    @CsvSource(textBlock = """
            Lets go to the movies, L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S
            Why isnt my code working, W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G
            """)
    @ParameterizedTest
    void shouldTransformStringToVaporcode(String input, String expectedResult) {
        assertThat(Vaporcode.vaporcode(input)).isEqualTo(expectedResult);
    }
}