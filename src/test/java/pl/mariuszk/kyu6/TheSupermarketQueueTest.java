package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TheSupermarketQueueTest {

    @MethodSource
    @ParameterizedTest
    void shouldReturnTotalTimeForCustomersToCheckOut(int[] customers, int checkoutNo, int expectedResult) {
        assertThat(TheSupermarketQueue.solveSuperMarketQueue(customers, checkoutNo)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnTotalTimeForCustomersToCheckOut() {
        return Stream.of(
                arguments(new int[]{2, 2, 3, 3, 4, 4}, 2, 9),
                arguments(new int[]{}, 1, 0),
                arguments(new int[]{1, 2, 3, 4, 5}, 1, 15),
                arguments(new int[]{5, 3, 4}, 1, 12),
                arguments(new int[]{10, 2, 3, 3}, 2, 10),
                arguments(new int[]{2, 3, 10}, 2, 12)
        );
    }
}