package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DescendingOrderTest {

    @CsvSource(textBlock = """
            0, 0
            42145, 54421
            145263, 654321
            123456789, 987654321
            15, 51
            """)
    @ParameterizedTest
    void shouldOrderDigitsDescending(int input, int expectedResult) {
        assertThat(DescendingOrder.sortDesc(input)).isEqualTo(expectedResult);
    }
}