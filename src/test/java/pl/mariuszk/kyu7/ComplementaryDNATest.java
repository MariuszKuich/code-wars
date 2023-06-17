package pl.mariuszk.kyu7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ComplementaryDNATest {

    @ParameterizedTest
    @CsvSource({ "TTTT, AAAA", "TAACG, ATTGC", "CATA, GTAT", "ATTGC, TAACG", "GTAT, CATA" })
    void shouldReturnComplementaryDNASide(String input, String expectedResult) {
        assertThat(ComplementaryDNA.makeComplement(input)).isEqualTo(expectedResult);
    }
}