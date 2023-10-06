package pl.mariuszk.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CreatePhoneNumberTest {

    @Test
    void shouldCreatePhoneNumber() {
        //given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //when
        String result = CreatePhoneNumber.createPhoneNumber(numbers);

        //then
        Assertions.assertThat(result).isEqualTo("(123) 456-7890");
    }
}