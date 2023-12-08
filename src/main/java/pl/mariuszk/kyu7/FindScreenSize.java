package pl.mariuszk.kyu7;

public class FindScreenSize {

    public static String findScreenHeight(int width, String ratio) {
        //String.split() method could be used
        int ratioWidth = Integer.parseInt(ratio.substring(0, ratio.indexOf(":")));
        int ratioHeight = Integer.parseInt(ratio.substring(ratio.indexOf(":") + 1));
        int height = width * ratioHeight / ratioWidth;
        return String.format("%dx%d", width, height);
    }
}
