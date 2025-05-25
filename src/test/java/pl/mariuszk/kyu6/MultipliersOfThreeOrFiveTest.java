package pl.mariuszk.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultipliersOfThreeOrFiveTest {

    private final MultipliersOfThreeOrFive systemUnderTest = new MultipliersOfThreeOrFive();

    @CsvSource(textBlock = """
            10, 23
            6, 8
            2, 0
            """)
    @ParameterizedTest
    void shouldReturnMultipliers(int number, int expectedSolution) {
        Assertions.assertThat(systemUnderTest.solution(number)).isEqualTo(expectedSolution);
    }
}