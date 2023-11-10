package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class YouOnlyNeedOneTest {

    @MethodSource("input")
    @ParameterizedTest
    void shouldCheckIfArrayContainsObject(Object[] arr, Object elem, boolean expectedResult) {
        assertThat(YouOnlyNeedOne.check(arr, elem)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                arguments(new Object[] {66, 101}, 66, true),
                arguments(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45, true),
                arguments(new Object[] {'t', 'e', 's', 't'}, 'e', true),
                arguments(new Object[] {"what", "a", "great", "kata"}, "kat", false)
        );
    }
}