package pl.mariuszk.kyu7;

public class CuringArachnophobia {

    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
        int eyeSize = (int) Math.pow(2, bodySize);
        String eyesOneSide = String.valueOf(eye).repeat(eyeSize / 2);
        return String.format(getLegs(legSize), String.format(getBody(bodySize), eyesOneSide + mouth + eyesOneSide));
    }

    private static String getLegs(int legSize) {
        return switch (legSize) {
            case 1 -> "^%s^";
            case 2 -> "/\\%s/\\";
            case 3 -> "/╲%s╱\\";
            case 4 -> "╱╲%s╱╲";
            default -> throw new IllegalStateException("Incorrect number of legs");
        };
    }

    private static String getBody(int bodySize) {
        return switch (bodySize) {
            case 1 -> "(%s)";
            case 2 -> "((%s))";
            case 3 -> "(((%s)))";
            default -> throw new IllegalStateException("Incorrect number of legs");
        };
    }
}
