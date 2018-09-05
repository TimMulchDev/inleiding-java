package h06;

import java.applet.Applet;
import java.awt.*;


public class Tijd extends Applet {
    private int minuten;
    private int uren;
    private int dagen;
    private int jaar;


    public void init() {
        int seconden = 1;
        minuten = seconden * 60;
        uren = minuten * 60;
        dagen = uren * 24;
        jaar = dagen * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in 1 minuut: " + minuten, 50, 60);
        g.drawString("Aantal seconden in 1 uur: " + uren, 50, 80);
        g.drawString("Aantal seconden in 1 dag: " + dagen, 50, 100);
        g.drawString("Aantal seconden in 1 jaar: " + jaar, 50, 120);

    }
}
