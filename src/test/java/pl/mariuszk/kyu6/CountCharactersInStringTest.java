package pl.mariuszk.kyu6;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class CountCharactersInStringTest {

    @Test
    public void testEmptyString() {
        assertThat(CountCharactersInString.count("")).isEmpty();
    }

    @Test
    public void testSingleCharacter() {
        //given
        Map<Character, Integer> characters = new HashMap<>();
        characters.put('a', 1);

        //expecting
        assertThat(CountCharactersInString.count("a")).isEqualTo(characters);
    }

    @Test
    public void testMultipleCharacters() {
        //given
        Map<Character, Integer> characters = new HashMap<>();
        characters.put('a', 3);
        characters.put('b', 3);
        characters.put('c', 1);

        //expecting
        assertThat(CountCharactersInString.count("aabbbac")).isEqualTo(characters);
    }

    @Test
    public void testAllCharactersUnique() {
        //given
        Map<Character, Integer> characters = new HashMap<>();
        characters.put('a', 1);
        characters.put('b', 1);
        characters.put('c', 1);

        //expecting
        assertThat(CountCharactersInString.count("abc")).isEqualTo(characters);
    }

    @Test
    public void testAllCharactersSame() {
        //given
        Map<Character, Integer> characters = new HashMap<>();
        characters.put('a', 5);

        //expecting
        assertThat(CountCharactersInString.count("aaaaa")).isEqualTo(characters);
    }

    @Test
    public void testDifferentCharacters() {
        //given
        Map<Character, Integer> characters = new HashMap<>();
        characters.put('a', 2);
        characters.put('b', 2);

        //expecting
        assertThat(CountCharactersInString.count("aabb")).isEqualTo(characters);
    }
}