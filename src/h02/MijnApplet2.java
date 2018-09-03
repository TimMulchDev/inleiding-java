package h02;

import java.applet.Applet;
import java.awt.*;

public class MijnApplet2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tim", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Mulch", 50, 80 );
    }
}
