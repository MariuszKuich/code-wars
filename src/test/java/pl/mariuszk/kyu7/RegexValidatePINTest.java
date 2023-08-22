package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RegexValidatePINTest {

    @CsvSource({
            "1234, true",
            "0000, true",
            "1111, true",
            "123456, true",
            "098765, true",
            "000000, true",
            "090909, true",
            "a234, false",
            ".234, false",
            "1, false",
            "12, false",
            "123, false",
            "12345, false",
            "1234567, false",
            "-1234, false",
            "1.234, false",
            "00000000, false",
    })
    @ParameterizedTest
    void shouldValidatePin(String pin, boolean expectedResult) {
        assertThat(RegexValidatePIN.validatePin(pin)).isEqualTo(expectedResult);
    }
}