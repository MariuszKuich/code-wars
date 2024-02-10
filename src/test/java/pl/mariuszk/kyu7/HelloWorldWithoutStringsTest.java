package pl.mariuszk.kyu7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldWithoutStringsTest {

    @Test
    void shouldReturnHelloWorldString() {
        assertThat(HelloWorldWithoutStrings.helloWorld()).isEqualTo("Hello, World!");
    }
}