package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PingPongTest {

    @CsvSource(textBlock = """
            ping-pong-ping-pong-bonk-bing-doof, ping
            pong-ping-dong-ping-pong-tink-bonk-pong-ping-doof, pong
            pong-ping-bink-ping-pong-donk, ping
            ping-ring-ping-dong, pong
            """)
    @ParameterizedTest
    void shouldDetermineTheWinner(String sounds, String expectedWinner) {
        assertThat(PingPong.pingPong(sounds)).isEqualTo(expectedWinner);
    }
}