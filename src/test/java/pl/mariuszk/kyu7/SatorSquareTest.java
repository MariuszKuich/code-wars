package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SatorSquareTest {

    @MethodSource
    @ParameterizedTest
    void shouldDetermineIfSatorSquareIsValid(char[][] input, boolean expectedResult) {
        assertThat(SatorSquare.isSatorSquare(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldDetermineIfSatorSquareIsValid() {
        return Stream.of(
                arguments(new char[][] {
                        {'T', 'E', 'N'},
                        {'E', 'Y', 'E'},
                        {'N', 'E', 'T'} }, true),
                arguments(new char[][] {
                        {'N', 'O', 'T'},
                        {'O', 'V', 'O'},
                        {'N', 'O', 'T'} }, false),
                arguments(new char[][] {
                        {'B', 'A', 'T', 'S'},
                        {'A', 'B', 'U', 'T'},
                        {'T', 'U', 'B', 'A'},
                        {'S', 'T', 'A', 'B'} }, true),
                arguments(new char[][] {
                        {'P', 'A', 'R', 'T'},
                        {'A', 'G', 'A', 'R'},
                        {'R', 'A', 'G', 'A'},
                        {'T', 'R', 'A', 'M'} }, false),
                arguments(new char[][] {
                        {'S', 'A', 'T', 'O', 'R'},
                        {'A', 'R', 'E', 'P', 'O'},
                        {'T', 'E', 'N', 'E', 'T'},
                        {'O', 'P', 'E', 'R', 'A'},
                        {'R', 'O', 'T', 'A', 'S'} }, true),
                arguments(new char[][] {
                        {'S', 'A', 'L', 'A', 'S'},
                        {'A', 'R', 'E', 'N', 'A'},
                        {'L', 'E', 'V', 'E', 'L'},
                        {'A', 'R', 'E', 'N', 'A'},
                        {'S', 'A', 'L', 'A', 'S'} }, false)
        );
    }
}