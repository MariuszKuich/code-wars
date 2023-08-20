package pl.mariuszk.kyu5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GreedTest {

    @MethodSource("shouldScoreThrowSource")
    @ParameterizedTest
    void shouldScoreThrow(int[] diceThrows, int expectedScore) {
        assertThat(Greed.greedy(diceThrows)).isEqualTo(expectedScore);
    }

    static Stream<Arguments> shouldScoreThrowSource() {
        return Stream.of(
          arguments(new int[] { 5, 1, 3, 4 ,1 }, 250),
          arguments(new int[] { 1, 1, 1, 3, 1 }, 1100),
          arguments(new int[] { 2, 4, 4, 5, 4 }, 450),
          arguments(new int[] { 6, 6, 6, 2, 3 }, 600),
          arguments(new int[] { 2, 2, 3, 3, 4, 4 }, 0)
        );
    }
}