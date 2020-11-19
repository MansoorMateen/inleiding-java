package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h103 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String tekst;



    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50,80);
        tekst =("");

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );

            if (getal == 1){
                tekst = "Januari 31 dagen";

            }
            if (getal == 2){
                tekst = "Februari 28 dagen (29 dagen tijdens schrikkeljaar)";
            }
            if (getal == 3){
                tekst = "Maart 31 dagen";
            }
            if (getal == 4){
                tekst = "April 30 dagen";
            }
            if (getal == 5){
                tekst = "Mei 31 dagen";
            }
            if (getal == 6){
                tekst = "Juni 30 dagen";
            }
            if (getal == 7){
                tekst = "Juli 31 dagen";
            }
            if (getal == 8){
                tekst = "Augustus 31 dagen";
            }
            if (getal == 9){
                tekst = "September 30 dagen";
            }
            if (getal == 10){
                tekst = "Oktober 31 dagen";
            }
            if (getal == 11){
                tekst = "November 30 dagen";
            }
            if (getal == 12){
                tekst = "December 31 dagen";
            }
            if (getal > 12 || getal < 1)  {
                tekst = "verkeerde getal ingetypt";
            }


            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
