package pl.mariuszk.kyu8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RemoveFirstLastCharTest {

    @CsvSource(textBlock = """
            eloquent, loquen
            country, ountr
            person, erso
            place, lac
            ok, ''
            """)
    @ParameterizedTest
    void removeTest(String input, String expectedResult) {
        Assertions.assertThat(RemoveFirstLastChar.remove(input)).isEqualTo(expectedResult);
    }
}