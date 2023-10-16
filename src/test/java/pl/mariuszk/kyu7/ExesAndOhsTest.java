package pl.mariuszk.kyu7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExesAndOhsTest {

    @CsvSource(textBlock = """
            true,  ''
            true,  ooxx
            false, xooxx
            true,  ooxXm
            true,  zpzpzpp
            false, zzoo
            true,  xxxooo
            true,  xxxXooOo
            false, xxx23424esdsfvxXXOOooo
            false, xXxxoewrcoOoo
            false, XxxxooO
            true,  zssddd
            false, Xxxxertr34
            """)
    @ParameterizedTest
    void shouldCheckIfStringHasTheSameAmountOfExesAndOhs(boolean expectedResult, String input) {
        Assertions.assertThat(ExesAndOhs.getXO(input)).isEqualTo(expectedResult);
    }
}