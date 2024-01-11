package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class WhatsANameInTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            Across the rivers, chris, true
            Next to a lake, chris, false
            Under a sea, chris, false
            A crew that boards the ship, chris, false
            A live son, Allison, false
            """)
    void checkIfStringContainsAllLettersOfAnotherString(String str, String anotherString, boolean expectedResul) {
        assertThat(WhatsANameIn.nameInStr(str, anotherString)).isEqualTo(expectedResul);
    }
}