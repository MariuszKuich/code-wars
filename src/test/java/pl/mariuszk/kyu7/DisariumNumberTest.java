package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DisariumNumberTest {

    @CsvSource(textBlock = """
            89, Disarium !!
            564, Not !!
            1024, Not !!
            """)
    @ParameterizedTest
    void shouldDetermineIfNumberIsDisarium(int number, String expectedResult) {
        assertThat(DisariumNumber.disariumNumber(number)).isEqualTo(expectedResult);
    }
}