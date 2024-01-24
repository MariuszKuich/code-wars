package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CorrectTheTimeStringTest {

    @MethodSource
    @ParameterizedTest
    void shouldReturnValidTimeString(String input, String expectedResult) {
        assertThat(CorrectTheTimeString.timeCorrect(input)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> shouldReturnValidTimeString() {
        return Stream.of(
                arguments(null, null),
                arguments("", ""),
                arguments("09:10:01", "09:10:01"),
                arguments("00:00:00", "00:00:00"),
                arguments("23:59:59", "23:59:59"),
                arguments("12:34:56", "12:34:56"),
                arguments("11:70:10", "12:10:10"),
                arguments("19:99:09", "20:39:09"),
                arguments("19:99:99", "20:40:39"),
                arguments("24:01:01", "00:01:01"),
                arguments("52:01:01", "04:01:01"),
                arguments("0:00:00", null),
                arguments("00:0:00", null),
                arguments("00:00:0", null),
                arguments("-0:00:00", null),
                arguments("00:00:000", null),
                arguments("000000", null),
                arguments("00;11;22", null),
                arguments("00:00:0/", null),
                arguments(":0:00:00", null),
                arguments("24:00:00", "00:00:00"),
                arguments("23:59:60", "00:00:00"),
                arguments("47:59:60", "00:00:00"),
                arguments("47:60:59", "00:00:59"),
                arguments("12:00:00", "12:00:00"),
                arguments("99:99:99", "04:40:39"),
                arguments("24:60:00", "01:00:00"),
                arguments("25:00:00", "01:00:00")
        );
    }
}