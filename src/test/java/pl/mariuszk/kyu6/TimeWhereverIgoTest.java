package pl.mariuszk.kyu6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class TimeWhereverIgoTest {

    @CsvSource(textBlock = """
            27-03-2021 19:41, Europe/Warsaw, Africa/Asmera, 27-03-2021 21:41
            27-03-2021 19:41, Europe/Warsaw, Australia/Sydney, 28-03-2021 05:41
            28-03-2021 19:41, Australia/Sydney, Europe/Warsaw, 28-03-2021 10:41
            19-03-2021 01:01, America/Halifax, Asia/Makassar, 19-03-2021 12:01
            01-12-2021 00:00, Europe/Dublin, Europe/Belfast, 01-12-2021 00:00
            07-12-2021 23:59, Pacific/Fiji, Europe/Berlin, 07-12-2021 12:59
            """)
    @ParameterizedTest
    void shouldDetermineTimeInDifferentTimeZone(String myTime, String myZone, String friendZone, String expectedResult) {
        assertThat(TimeWhereverIgo.getFriendDateAndTime(myTime, myZone, friendZone)).isEqualTo(expectedResult);
    }
}