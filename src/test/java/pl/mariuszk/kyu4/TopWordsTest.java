package pl.mariuszk.kyu4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TopWordsTest {

    @ParameterizedTest
    @MethodSource
    void top3Test(String inputString, List<String> expectedResult) {
        assertThat(TopWords.top3(inputString)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> top3Test() {
        return Stream.of(
          arguments("a a a  b  c c  d d d d  e e e e e", List.of("e", "d", "a")),
          arguments("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e", List.of("e", "ddd", "aa")),
          arguments("  //wont won't won't ", List.of("won't", "wont")),
          arguments("  , e   .. ", List.of("e", "d", "a")),
          arguments("a a a  b  c c  d d d d  e e e e e", List.of("e")),
          arguments("  ...  ", Collections.emptyList()),
          arguments("  '  ", Collections.emptyList()),
          arguments("  '''  ", Collections.emptyList()),
          arguments(
                  String.join("\n", "In a village of La Mancha, the name of which I have no desire to call to",
                          "mind, there lived not long since one of those gentlemen that keep a lance",
                          "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                          "coursing. An olla of rather more beef than mutton, a salad on most",
                          "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                          "on Sundays, made away with three-quarters of his income."),
                  List.of("a", "of", "on")
          )
        );
    }
}