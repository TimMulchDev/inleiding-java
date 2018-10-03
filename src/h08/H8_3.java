package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8_3 extends Applet {

    float uitkomst;
    Button knop1;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init(){
        setSize(1600, 900);
        tekstvak = new TextField("",20);
        label = new Label("Voer hier uw bedrag in:  ");
        knop1 = new Button();
        knop1.setLabel("Calculate");
        knop1.addActionListener(new calcListener());
        tekstvak.addActionListener(new calcListener());
        add(label);
        add(tekstvak);
        add(knop1);
    }

    public void paint(Graphics g) {
        g.drawString("Nieuwe bedrag inclusief 21% BTW = " + uitkomst, 50, 80);
    }

    class calcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            float nummer = Float.parseFloat(tekstvak.getText());
            uitkomst = nummer / 100 * 121;
            repaint();
        }

    }
}