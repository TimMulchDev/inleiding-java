package h08;

import java.awt.*;
        import java.applet.*;

public class Tekstvak extends Applet {
    TextField tekstvak;
    Label label;


    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {}

}