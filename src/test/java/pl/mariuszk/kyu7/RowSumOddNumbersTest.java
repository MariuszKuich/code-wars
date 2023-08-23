package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RowSumOddNumbersTest {

    @CsvSource({
            "1, 1",
            "2, 8",
            "3, 27",
            "4, 64",
            "5, 125",
            "42, 74088"
    })
    @ParameterizedTest
    void shouldSumOddNumbersFromGivenRow(int rowNo, int expectedSum) {
        assertThat(RowSumOddNumbers.rowSumOddNumbers(rowNo)).isEqualTo(expectedSum);
    }
}