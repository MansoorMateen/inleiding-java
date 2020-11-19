package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h102 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double hoogste;
    double laagste;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
        g.drawString("Het hoogste getal is " + hoogste, 50,80);
        g.drawString("Het laagste getal is " + laagste, 50,100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            if (hoogste <= getal){
                hoogste = getal;
            }
            if (laagste >= getal){
                laagste = getal;
            }

            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
