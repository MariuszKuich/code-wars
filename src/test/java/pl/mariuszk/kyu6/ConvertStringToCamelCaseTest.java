package pl.mariuszk.kyu6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertStringToCamelCaseTest {

    @Test
    void shouldReturnEmptyString() {
        //given
        String input = "";

        //when
        String result = ConvertStringToCamelCase.toCamelCase(input);

        //then
        assertThat(result).isEqualTo("");
    }

    @Test
    void shouldReturnPascalCaseWithFirstWordNotCapitalized() {
        //given
        String input = "the_stealth_warrior";

        //when
        String result = ConvertStringToCamelCase.toCamelCase(input);

        //then
        assertThat(result).isEqualTo("theStealthWarrior");
    }

    @Test
    void shouldReturnPascalCaseWithFirstWordCapitalized() {
        //given
        String input = "The-Stealth_Warrior";

        //when
        String result = ConvertStringToCamelCase.toCamelCase(input);

        //then
        assertThat(result).isEqualTo("TheStealthWarrior");
    }
}