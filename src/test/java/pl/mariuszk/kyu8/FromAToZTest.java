package pl.mariuszk.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FromAToZTest {

    @CsvSource(textBlock = """
            a-z, abcdefghijklmnopqrstuvwxyz
            h-o, hijklmno
            Q-Z, QRSTUVWXYZ
            J-J, J
            a-b, ab
            a-a, a
            g-i, ghi
            H-I, HI
            y-z, yz
            e-k, efghijk
            a-q, abcdefghijklmnopq
            F-O, FGHIJKLMNO
            """)
    @ParameterizedTest
    void shouldGenerateStringContainingAllLettersFromRange(String range, String expectedResult) {
        assertThat(FromAToZ.gimmeTheLetters(range)).isEqualTo(expectedResult);
    }
}