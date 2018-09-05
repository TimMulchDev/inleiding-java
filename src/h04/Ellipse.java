package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellipse extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.fillArc(20, 80, 100, 50, 360, 360);
    }
}
