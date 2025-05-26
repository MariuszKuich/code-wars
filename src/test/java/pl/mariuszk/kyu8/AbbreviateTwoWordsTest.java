package pl.mariuszk.kyu8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AbbreviateTwoWordsTest {

    @CsvSource(textBlock = """
            Sam Harris, S.H
            Patrick Feenan, P.F
            Evan Cole, E.C
            P Favuzzi, P.F
            David Mendieta, D.M
            patric feeney, P.F
            """)
    @ParameterizedTest
    void abbrevNameTest(String name, String expectedResult) {
        Assertions.assertThat(AbbreviateTwoWords.abbrevName(name)).isEqualTo(expectedResult);
    }
}