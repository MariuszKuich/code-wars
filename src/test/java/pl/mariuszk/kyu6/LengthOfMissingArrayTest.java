package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LengthOfMissingArrayTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldReturnLengthOfMissingArray(Object[][] array, int expectedLength) {
        assertThat(LengthOfMissingArray.getLengthOfMissingArray(array)).isEqualTo(expectedLength);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(new Object[][]{
                        new Object[]{1, 2},
                        new Object[]{4, 5, 1, 1},
                        new Object[]{1},
                        new Object[]{5, 6, 7, 8, 9}
                }, 3),
                arguments(new Object[][]{
                        new Object[]{5, 2, 9},
                        new Object[]{4, 5, 1, 1},
                        new Object[]{1},
                        new Object[]{5, 6, 7, 8, 9}
                }, 2),
                arguments(new Object[][]{
                        new Object[]{null},
                        new Object[]{null, null, null}
                }, 2),
                arguments(new Object[][]{
                        new Object[]{'a', 'a', 'a'},
                        new Object[]{'a', 'a'},
                        new Object[]{'a', 'a', 'a', 'a'},
                        new Object[]{'a'},
                        new Object[]{'a', 'a', 'a', 'a', 'a', 'a'}
                }, 5),
                arguments(new Object[][]{}, 0)
        );
    }
}