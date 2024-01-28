package pl.mariuszk.kyu7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AreTheNumbersInOrderTest {

    @Test
    void shouldReturnTrueForNumbersInAscendingOrder() {
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{})).isTrue();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{1})).isTrue();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{1, 2})).isTrue();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{1, 1, 3})).isTrue();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058})).isTrue();
    }

    @Test
    void shouldReturnFalseForNumbersNotInAscendingOrder() {
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{2, 1})).isFalse();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{1, 3, 2})).isFalse();
        assertThat(AreTheNumbersInOrder.isAscOrder(new int[]{56, 98, 123, 67, 742, 1024, 32, 90969})).isFalse();
    }
}