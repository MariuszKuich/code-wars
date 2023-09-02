package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class OrderTest {

    @MethodSource
    @ParameterizedTest
    void shouldSortWordsInString(String input, String expectedResult) {
        assertThat(Order.order(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldSortWordsInString() {
        return Stream.of(
                arguments("is2 Thi1s T4est 3a", "Thi1s is2 3a T4est"),
                arguments("4of Fo1r pe6ople g3ood th5e the2", "Fo1r the2 g3ood 4of th5e pe6ople"),
                arguments("", "")
        );
    }
}