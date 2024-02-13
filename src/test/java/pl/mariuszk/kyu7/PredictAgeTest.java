package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PredictAgeTest {

    @CsvSource(textBlock = """
            65,60,75,55,60,63,64,45, 86
            32,54,76,65,34,63,64,45, 79
            """)
    @ParameterizedTest
    void shouldPredictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8, int result) {
        assertThat(PredictAge.predictAge(age1, age2, age3, age4, age5, age6, age7, age8)).isEqualTo(result);
    }
}