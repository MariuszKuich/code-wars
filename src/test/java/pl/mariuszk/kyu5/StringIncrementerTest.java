package pl.mariuszk.kyu5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringIncrementerTest {

    @CsvSource(textBlock = """
            foobar000, foobar001
            foo, foo1
            foobar001, foobar002
            foobar99, foobar100
            foobar099, foobar100
            '', 1
            fo99obar99, fo99obar100
            'twkjEnoWtvc"W=pw95,r6-suITRmoj:^<:d_K2253754605840000825094523', 'twkjEnoWtvc"W=pw95,r6-suITRmoj:^<:d_K2253754605840000825094524'
            """)
    @ParameterizedTest
    void shouldAppendIncrementedNumberToTheString(String str, String expectedResult) {
        assertThat(StringIncrementer.incrementString(str)).isEqualTo(expectedResult);
    }
}