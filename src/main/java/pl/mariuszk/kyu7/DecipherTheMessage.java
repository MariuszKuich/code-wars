package pl.mariuszk.kyu7;

public class DecipherTheMessage {

    public static String decipher(String codedMessage) {
        StringBuilder result = new StringBuilder();
        for (char c : codedMessage.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int offset = (c - base + 7) % 26;
                result.append((char) (base + offset));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
