package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10_2 extends Applet {
    Label label;
    TextField tekstvak;
    int getal;
    int getal2;
    int getal3;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ een cijfer in en watch the magic happen");

        add(label);
        add(tekstvak);

        tekstvak.addActionListener(new TekstvakListener());
    }

    public void paint(Graphics g) {
        g.drawString("Ingevoerde Getal:" + getal, 70, 60);
        g.drawString("Hoogste getal:" + getal2, 70, 80);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            // Calculate
            if (getal > getal2)
                getal2 = getal;
            repaint();
        }
    }
}