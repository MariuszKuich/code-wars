package pl.mariuszk.kyu5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DirReductionTest {

    @MethodSource("dataSource")
    @ParameterizedTest
    void shouldReduceDirections(String[] input, String[] expectedResult) {
        assertThat(DirReduction.dirReduc(input)).containsExactly(expectedResult);
    }

    private static Stream<Arguments> dataSource() {
        return Stream.of(
                arguments(
                        new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" },
                        new String[] { "WEST" }
                ),
                arguments(
                        new String[] { "NORTH","SOUTH","SOUTH","EAST","WEST","NORTH" },
                        new String[] {}
                ),
                arguments(
                        new String[] { "NORTH", "SOUTH", "EAST", "WEST" },
                        new String[] {}
                ),
                arguments(
                        new String[] { "NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST" },
                        new String[] { "WEST", "WEST" }
                ),
                arguments(
                        new String[] { "NORTH", "WEST", "SOUTH", "EAST" },
                        new String[] { "NORTH", "WEST", "SOUTH", "EAST" }
                )
        );
    }
}