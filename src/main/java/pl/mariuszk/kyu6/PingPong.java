package pl.mariuszk.kyu6;

public class PingPong {

    public static String pingPong(String sounds) {
        int pingScore = 0;
        int pongScore = 0;
        String servedBy = "";
        String lastBadShotBy = "";
        for(String sound : sounds.split("-")) {
            if (sound.equals("ping") || sound.equals("pong")) {
                if (servedBy.isEmpty()) {
                    servedBy = sound;
                }
                lastBadShotBy = sound;
            } else {
                if (!servedBy.isEmpty()) {
                    if (servedBy.equals("ping") && lastBadShotBy.equals("pong")) {
                        pingScore++;
                    }
                    if (servedBy.equals("pong") && lastBadShotBy.equals("ping")) {
                        pongScore++;
                    }
                    servedBy = "";
                }
            }
        }
        if (pingScore == pongScore) {
            return lastBadShotBy.equals("ping") ? "pong" : "ping";
        }
        return pingScore > pongScore ? "ping" : "pong";
    }
}
