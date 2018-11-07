package H11;

import java.applet.Applet;
import java.awt.*;

public class Schaken extends Applet {
    public void init(){
        setSize(600, 600); // Geef ons genoeg ruimte om het schaakbord te kunnen weergeven
        setBackground(Color.DARK_GRAY); // Zet de achtergrond naar donker grijs
    }
    byte[] map = {
            1, 0, 1, 0, 1, 0, 1, 0,
            0, 1, 0, 1, 0, 1, 0, 1,
            1, 0, 1, 0, 1, 0, 1, 0,
            0, 1, 0, 1, 0, 1, 0, 1,
            1, 0, 1, 0, 1, 0, 1, 0,
            0, 1, 0, 1, 0, 1, 0, 1,
            1, 0, 1, 0, 1, 0, 1, 0,
            0, 1, 0, 1, 0, 1, 0, 1
    }; // Maak een map met kleuren erin. 1 = zwart, 0 = wit

    public void paint(Graphics g){
        int x = 0, y = 0; // Locatie op het schaakbord. X = horizontaal, Y = verticaal
        for(byte c : map){ // Voor elke byte in de map
            if(c == 1) // Als de kleur 1 is > Zet de kleur naar zwart
                g.setColor(Color.BLACK);
            else if(c == 0) // Als de kleur 0 is > Zet de kleur naar wit
                g.setColor(Color.WHITE);

            g.fillRect(100+50*x, 100+50*y, 50, 50); // Teken het vakje in
            x++; // Voeg 1 toe aan x (Ga de volgende keer naar het volgende vakje)
            if(x >= 8) // Als het volgende vakje uit het speelveld is, reset x en ga 1 omlaag.
                x = 0; y++;
        }
        g.drawRect(100, 100, 400, 400); // Teken de rand van het schaakbord
    }
}