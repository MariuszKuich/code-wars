package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerDepthTest {

    @CsvSource(textBlock = """
            1, 10
            42, 9
            """)
    @ParameterizedTest
    void shouldComputeIntegerDepth(int input, int expectedDepth) {
        assertThat(new IntegerDepth().computeDepth(input)).isEqualTo(expectedDepth);
    }
}