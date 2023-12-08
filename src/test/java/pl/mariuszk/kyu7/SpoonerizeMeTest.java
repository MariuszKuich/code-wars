package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SpoonerizeMeTest {

    @CsvSource(textBlock = """
            nit picking, pit nicking
            wedding bells, bedding wells
            jelly beans, belly jeans
            """)
    @ParameterizedTest
    void shouldSwapWordsFirstLetters(String input, String expectedResult) {
        assertThat(new SpoonerizeMe().spoonerize(input)).isEqualTo(expectedResult);
    }
}