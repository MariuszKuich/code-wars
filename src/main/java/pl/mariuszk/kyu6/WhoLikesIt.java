package pl.mariuszk.kyu6;

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return names[0] + " likes this";
        }
        if (names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        }
        if (names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        }
        return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    }
}
