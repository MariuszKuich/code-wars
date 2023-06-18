package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidBracesTest {

    @ParameterizedTest
    @CsvSource({
            "(), true",
            "[(]), false",
            "(){}[], true",
            "([{}]), true",
            "(}, false",
            "[(]), false",
            "[({})](], false",
            "}({}), false",
            "}]){[(, false"
    })
    void shouldDetermineIfBracesAreValid(String input, boolean expectedResult) {
        //given
        ValidBraces validBraces = new ValidBraces();
        //when + then
        assertThat(validBraces.isValid(input)).isEqualTo(expectedResult);
    }
}