package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountSheepTest {

    @MethodSource
    @ParameterizedTest
    void shouldCreateSheepCountingString(int input, String expectedResult) {
        assertThat(CountSheep.countingSheep(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldCreateSheepCountingString() {
        return Stream.of(
                arguments(0, ""),
                arguments(1, "1 sheep..."),
                arguments(2, "1 sheep...2 sheep..."),
                arguments(3, "1 sheep...2 sheep...3 sheep..."),
                arguments(9, "1 sheep...2 sheep...3 sheep...4 sheep...5 sheep...6 sheep...7 sheep...8 sheep...9 sheep...")
        );
    }
}