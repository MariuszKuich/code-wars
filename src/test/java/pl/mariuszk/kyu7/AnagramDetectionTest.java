package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramDetectionTest {

    @CsvSource(textBlock = """
            foefet, toffee, true
            Buckethead, DeathCubeK, true
            Twoo, Woot, true
            apple, pale, false
            test, tes, false
            test, testabc, false
            test, '', false
            test, tsttee, false
            ADAD, BCBC, false
            """)
    @ParameterizedTest
    void shouldCheckIfStringIsAnagram(String test, String original, boolean expectedResult) {
        assertThat(AnagramDetection.isAnagram(test, original)).isEqualTo(expectedResult);
    }
}