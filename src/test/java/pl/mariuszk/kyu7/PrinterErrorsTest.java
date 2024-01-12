package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterErrorsTest {

    @CsvSource(textBlock = """
            aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz, 3/56
            aaabbbbhaijjjm, 0/14
            aaaxbbbbyyhwawiwjjjwwm, 8/22
            """)
    @ParameterizedTest
    void shouldReturnPrinterErrorsToAllCharactersRatio(String input, String expectedResult) {
        assertThat(PrinterErrors.printerError(input)).isEqualTo(expectedResult);
    }
}