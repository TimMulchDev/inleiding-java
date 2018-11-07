package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
    
public class H8_2 extends Applet {

    int man;
    int vrouw;
    int pman;
    int pvrouw;
    int totaal;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    public void init(){
        setSize(1600, 900);
        knop1 = new Button();
        knop1.setLabel("Man");
        knop1.addActionListener(new manListener());
        knop2 = new Button();
        knop2.setLabel("Vrouw");
        knop2.addActionListener(new vrouwListener());
        knop3 = new Button();
        knop3.setLabel("Potentiële man");
        knop3.addActionListener(new pmanListener());
        knop4 = new Button();
        knop4.setLabel("Potentiële vrouw");
        knop4.addActionListener(new pvrouwListener());
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    class manListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class vrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class pmanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pman = pman + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class pvrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pvrouw = pvrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen aanwezig: = " + pman, 50, 80);
        g.drawString("Aantal vrouwen aanwezeig: = " + vrouw, 50, 100);
        g.drawString("Aantal mannen aanwezeig: = " + pman, 50, 120);
        g.drawString("Aantal vrouwen aanwezeig: = " + pvrouw, 50, 140);
        g.drawString("Totaal aantal mensen aanwezeig: = " + totaal, 50, 160);
    }
}