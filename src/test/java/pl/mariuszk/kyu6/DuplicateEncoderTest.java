package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DuplicateEncoderTest {

    @MethodSource
    @ParameterizedTest
    void shouldEncodeMessage(String input, String expectedResult) {
        assertThat(DuplicateEncoder.encode(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldEncodeMessage() {
        return Stream.of(
                arguments("Prespecialized", ")()())()(()()("),
                arguments("   ()(   ", "))))())))"),
                arguments("din", "((("),
                arguments("recede", "()()()"),
                arguments("Success", ")())())"),
                arguments("(( @", "))((")
        );
    }
}