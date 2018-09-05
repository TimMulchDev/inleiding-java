package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstknop extends Applet {
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Type hier eens iets, gewoon om te testen. haha? ", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("You know it, " + "Mulch is the best!");
            repaint();
        }
    }
}