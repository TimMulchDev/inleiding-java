package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10_praktijkopdracht extends Applet {
    String uitkomst;
    TextField tekstvak;
    Button knop;
    int a, b, antwoord;
    Color kleur;

    public void init() {
        uitkomst = "";

        tekstvak = new TextField("", 5);
        add(tekstvak);

        knop = new Button("Bereken");
        knop.addActionListener(new Uitkomst());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setColor(kleur);
        g.drawString(""+uitkomst, 100, 50);
        g.setColor(Color.red);
        g.fillArc(50, 150, 100, 100, 0, 360);
        g.fillRect(300, 70, 40, 180);
        g.setColor(Color.green);
        g.fillArc(50, 150, 100, 100, 90, 0+b);
        g.fillRect(300, 70, 40, 0+b/2);
        g.setColor(Color.black);
        g.drawRect(300, 70, 40, 0+b/2);
        g.drawArc(50, 150, 100, 100, 0, 360);
        g.drawRect(300, 70, 40, 180);
    }

    class Uitkomst implements ActionListener {
        public void actionPerformed(ActionEvent ex) {
            String input = tekstvak.getText();
            a = Integer.parseInt(input);
            antwoord = a;
            uitkomst = "je hebt een "+a+" gehaald!";
            if (antwoord <= 1) {
                kleur = Color.RED;
                b=36;
            } else if (antwoord == 2) {
                kleur = Color.RED;
                b=72;
            } else if (antwoord == 3) {
                kleur = Color.RED;
                b=108;
            } else if (antwoord == 4) {
                kleur = Color.ORANGE;
                b=144;
            } else if (antwoord == 5) {
                kleur = Color.YELLOW;
                b=180;
            } else if (antwoord == 6) {
                kleur = Color.green;
                b=216;
            } else if (antwoord == 7) {
                kleur = Color.green;
                b=252;
            } else if (antwoord == 8) {
                kleur = Color.GREEN;
                b=288;
            } else if (antwoord == 9) {
                kleur = Color.GREEN;
                b=324;
            } else if (antwoord >= 10) {
                kleur = Color.GREEN;
                b=360;
            }
            repaint();
        }
    }
}