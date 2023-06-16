package pl.mariuszk.kyu6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DetectPangramTest {

    private DetectPangram detectPangram = new DetectPangram();

    @Test
    void shouldReturnTrueWhenStringIsPangram() {
        //given
        String input = "The quick brown fox jumps over the lazy dog.";

        //when
        boolean result = detectPangram.check(input);

        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = { "You shall not pass!", "QWERĄYUIOPASDFGHJKLZXCVBNM" })
    void shouldReturnFalseWhenStringIsNotPangram(String input) {
        //when
        boolean result = detectPangram.check(input);

        //then
        assertFalse(result);
    }
}