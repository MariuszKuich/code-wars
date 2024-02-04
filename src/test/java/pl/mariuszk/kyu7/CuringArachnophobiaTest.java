package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CuringArachnophobiaTest {

    @CsvSource(textBlock = """
            1, 1, W, o, ^(oWo)^
            2, 2, w, O, /\\((OOwOO))/\\
            3, 3, w, 0, /╲(((0000w0000)))╱\\
            """)
    @ParameterizedTest
    void shouldDrawSpider(int legSize, int bodySize, char mouth, char eye, String expectedResult) {
        assertThat(CuringArachnophobia.drawSpider(legSize, bodySize, mouth, eye)).isEqualTo(expectedResult);
    }
}