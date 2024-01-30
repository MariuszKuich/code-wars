package pl.mariuszk.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponsibleDrinking {

    public String hydrate(String drinkString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(drinkString);
        int glassesOfWater = 0;
        while (matcher.find()) {
            glassesOfWater += Integer.parseInt(matcher.group());
        }
        return glassesOfWater + (glassesOfWater > 1 ? " glasses" : " glass") + " of water";
    }
}
