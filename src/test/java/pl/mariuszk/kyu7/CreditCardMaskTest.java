package pl.mariuszk.kyu7;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CreditCardMaskTest {

    @CsvSource(textBlock = """
            4556364607935616, ############5616
            64607935616, #######5616
            1, 1
            '', ''
            Nananananananananananananananana Batman!, ####################################man!
            Skippy, ##ippy
            """)
    @ParameterizedTest
    void shouldChangeAllButLastFourCharactersToHashes(String input, String expectedResult) {
        assertThat(CreditCardMask.maskify(input)).isEqualTo(expectedResult);
    }
}