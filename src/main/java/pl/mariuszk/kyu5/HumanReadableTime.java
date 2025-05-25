package pl.mariuszk.kyu5;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int minutes, hours;

        minutes = seconds / 60;
        hours = minutes / 60;

        seconds -= minutes * 60;
        minutes -= hours * 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds % 60);
    }
}
