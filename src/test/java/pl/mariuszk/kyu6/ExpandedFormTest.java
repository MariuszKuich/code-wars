package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ExpandedFormTest {

    @CsvSource({
            "12, 10 + 2",
            "42, 40 + 2",
            "70304, 70000 + 300 + 4"
    })
    @ParameterizedTest
    void shouldReturnExpandedFormOfANumber(int input, String expectedResult) {
        assertThat(ExpandedForm.expandedForm(input)).isEqualTo(expectedResult);
    }
}