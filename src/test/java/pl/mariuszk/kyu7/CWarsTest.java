package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CWarsTest {

    @CsvSource(textBlock = """
            code wars, C.Wars
            Barack hussain obama, B.H.Obama
            barrack hussain Obama, B.H.Obama
            """)
    @ParameterizedTest
    void shouldReturnInitials(String name, String initials) {
        assertThat(CWars.initials(name)).isEqualTo(initials);
    }
}