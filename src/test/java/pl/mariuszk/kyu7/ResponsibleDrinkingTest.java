package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ResponsibleDrinkingTest {

    @CsvSource(textBlock = """
            1 beer, 1 glass of water
            '1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer', 10 glasses of water
            """)
    @ParameterizedTest
    void shouldReturnRecommendedNumberOfGlassesOfWater(String input, String expectedResult) {
        assertThat(new ResponsibleDrinking().hydrate(input)).isEqualTo(expectedResult);
    }
}