package pl.mariuszk.kyu5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SecureTesterTest {

    @ValueSource(strings = {
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
            "validINPUT",
            "val123id",
            "aBC123"
    })
    @ParameterizedTest
    void shouldReturnTrueForAlphanumericInput(String input) {
        assertThat(SecureTester.alphanumeric(input)).isTrue();
    }

    @ValueSource(strings = {
            "",
            "_",
            "with space",
            "with_underscore",
            "punctuation.",
            "naïve",
            "１strangedigit",
            "emoji😊"
    })
    @ParameterizedTest
    void shouldReturnFalseForNotAlphanumericInput(String input) {
        assertThat(SecureTester.alphanumeric(input)).isFalse();
    }
}