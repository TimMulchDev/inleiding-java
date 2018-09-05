package h06;

import java.applet.Applet;
import java.awt.*;

public class Waarde extends Applet {
    private int negatief;
    private int positief1;
    private int positief2;
    private int uitkomst;

    public void init() {
        negatief = -10;
        positief1 = 3;
        positief2 = 2;
        uitkomst = negatief + positief1 + positief2;
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst = " + uitkomst, 50, 80);

    }
}
