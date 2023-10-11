package pl.mariuszk.kyu6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWhereverIgo {

    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        ZonedDateTime myZonedDateTime = ZonedDateTime.of(LocalDateTime.parse(myTime, formatter), ZoneId.of(myZone));
        return ZonedDateTime.ofInstant(myZonedDateTime.toInstant(), ZoneId.of(friendZone)).format(formatter);
    }
}
