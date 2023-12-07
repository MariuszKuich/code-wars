package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FindScreenSizeTest {

    @CsvSource(textBlock = """
            1024, 4:3, 1024x768
            1280, 16:9, 1280x720
            3840, 32:9, 3840x1080
            """)
    @ParameterizedTest
    void shouldReturnScreenDimensions(int width, String ratio, String expectedResult) {
        assertThat(FindScreenSize.findScreenHeight(width, ratio)).isEqualTo(expectedResult);
    }
}