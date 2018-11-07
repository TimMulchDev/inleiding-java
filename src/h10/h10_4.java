package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10_4 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    String tekst;
    int jaartal;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal");
        tekst = "";
        add(label);
        add(tekstvak);
        tekstvak.addActionListener( new TekstvakListener() );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar jonge!";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar, jammer!";
            }
            repaint();
        }
    }
}