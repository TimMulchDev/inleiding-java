package h11;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;

public class H11_1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller <= 9; teller++) {
            x += 20;
            g.drawLine(x , 20, x, 280);
            g.drawString("" + teller, x, 15 );
        }
    }
}