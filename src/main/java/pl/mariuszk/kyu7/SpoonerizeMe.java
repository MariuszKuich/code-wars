package pl.mariuszk.kyu7;

public class SpoonerizeMe {

    public String spoonerize(String words) {
        String[] separatedWords = words.split(" ");
        String firstWord = separatedWords[0];
        String secondWord = separatedWords[1];
        char firstLetter = firstWord.charAt(0);
        firstWord = secondWord.charAt(0) + firstWord.substring(1);
        secondWord = firstLetter + secondWord.substring(1);
        return String.format("%s %s", firstWord, secondWord);
    }
}
