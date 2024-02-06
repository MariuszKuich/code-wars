package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DecipherTheMessageTest {

    @CsvSource(textBlock = """
            '', ''
            lvahhe bl lh uhkbgz b vtg'm uxebxox maxkx tkx lh ftgr ahnkl exym, school is so boring i can't believe there are so many hours left
            HFZ FTR RHNK WKXLL BL LH VNMX, OMG MAY YOUR DRESS IS SO CUTE
            Axr Ftr! Pabva mxtvaxk wh rhn mabgd bl gbvxk - Fk. Chgxl hk Fkl. Itmxe?, Hey May! Which teacher do you think is nicer - Mr. Jones or Mrs. Patel?
            """)
    @ParameterizedTest
    void shouldDecipherMessage(String codedMessage, String expectedResult) {
        assertThat(DecipherTheMessage.decipher(codedMessage)).isEqualTo(expectedResult);
    }
}