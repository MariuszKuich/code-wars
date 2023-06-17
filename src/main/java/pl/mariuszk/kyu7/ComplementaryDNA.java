package pl.mariuszk.kyu7;

import java.util.Map;
import java.util.stream.Collectors;

public class ComplementaryDNA {

    private static final Map<Character, String> COMPLEMENTARY_VALUES = Map.of(
            'A', "T",
            'T', "A",
            'C', "G",
            'G', "C"
    );
    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> (char)c)
                .map(COMPLEMENTARY_VALUES::get)
                .collect(Collectors.joining());
    }
}
