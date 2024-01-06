package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class BumpsInTheRoadTest {

    @CsvSource(textBlock = """
            n, Woohoo!
            __nn_nnnn__n_n___n____nn__nnn, Woohoo!
            nnn_n__n_n___nnnnn___n__nnn__, Woohoo!
            ______n___n_, Woohoo!
            _nnnnnnn_n__n______nn__nn_nnn, Car Dead
            nnnnnnnnnnnnnnnnnnnnn, Car Dead
            """)
    @ParameterizedTest
    void shouldDetermineIfHomeCanBeReached(String road, String expectedResult) {
        assertThat(BumpsInTheRoad.bumps(road)).isEqualTo(expectedResult);
    }
}