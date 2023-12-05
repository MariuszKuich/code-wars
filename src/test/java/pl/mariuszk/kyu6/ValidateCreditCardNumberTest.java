package pl.mariuszk.kyu6;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateCreditCardNumberTest {

    @CsvSource(textBlock = """
            1, false
            891, false
            374245455400126, true
            """)
    @ParameterizedTest
    void shouldReturnTrueIfCreditCardNumberIsValid(String cardNumber, boolean expectedResult) {
        assertThat(ValidateCreditCardNumber.validate(cardNumber)).isEqualTo(expectedResult);
    }
}