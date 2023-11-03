package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Testing123Test {

    @MethodSource
    @ParameterizedTest
    void shouldInsertNumberAtBeginningOfEachString(List<String> input, List<String> expectedResult) {
        assertThat(Testing123.number(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldInsertNumberAtBeginningOfEachString() {
        return Stream.of(
                arguments(Arrays.asList("a", "b", "c"), List.of("1: a", "2: b", "3: c")),
                arguments(Arrays.asList("", "", "", "", ""), List.of("1: ", "2: ", "3: ", "4: ", "5: "))
        );
    }
}