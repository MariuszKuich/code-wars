package pl.mariuszk.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HumanReadableTimeTest {

    @CsvSource(textBlock = """
            0, 00:00:00
            5, 00:00:05
            60, 00:01:00
            86399, 23:59:59
            359999, 99:59:59
            """)
    @ParameterizedTest
    void makeReadableTest(int seconds, String expectedResult) {
        Assertions.assertThat(HumanReadableTime.makeReadable(seconds)).isEqualTo(expectedResult);
    }
}