package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ThinkingAndTestingTest {

    @CsvSource(textBlock = """
            '', ''
            a, A
            b, B
            a a, A A
            a b, A B
            a b c, A B C
            aa, aA
            c jkjd eb lrxlk, C jkjD eB lrxlK
            """)
    @ParameterizedTest
    void shouldDoTheThing(String input, String expectedResult) {
        assertThat(ThinkingAndTesting.testSomethingCapitalized(input)).isEqualTo(expectedResult);
    }
}