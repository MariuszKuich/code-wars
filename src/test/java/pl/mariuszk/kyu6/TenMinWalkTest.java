package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TenMinWalkTest {

    @MethodSource
    @ParameterizedTest
    void shouldDetermineIfItIsATenMinuteWalk(char[] input, boolean expectedResult) {
        assertThat(TenMinWalk.isValid(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldDetermineIfItIsATenMinuteWalk() {
        return Stream.of(
          arguments(new char[] { 'n','s','n','s','n','s','n','s','n','s' }, true),
          arguments(new char[] { 'w','e','w','e','w','e','w','e','w','e','w','e' }, false),
          arguments(new char[] { 'w' }, false),
          arguments(new char[] { 'n','n','n','s','n','s','n','s','n','s' }, false),
          arguments(new char[] { 'n','e','s','w','n','e','s','w','n','s' }, true),
          arguments(new char[] { 'n','e','s','w','n','e','s','w','n', 'n' }, false)
        );
    }
}