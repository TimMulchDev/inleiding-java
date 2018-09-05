package h06;

import java.awt.*;
import java.applet.*;


public class Geld extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 110;
        b = 3;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan, Ali, Jeannette en jij hebben een kwarwei verricht, ieder krijg: " + uitkomst, 20, 20);
    }
}