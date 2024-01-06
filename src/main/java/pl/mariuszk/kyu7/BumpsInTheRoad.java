package pl.mariuszk.kyu7;

public class BumpsInTheRoad {

    public static String bumps(final String road) {
        return road.replaceAll("_", "").length() <= 15 ? "Woohoo!" : "Car Dead";
    }
}
