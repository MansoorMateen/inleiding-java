package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h101 extends Applet {
    TextField tekstvak;

    double getal;
    double getal2;
    Button plus;
    Button deel;
    Button keer;
    Button min;


    public void init() {
        tekstvak = new TextField("", 10);
        TV = new TextField("", 10);
        plus = new Button("+");
        deel = new Button("/");
        keer = new Button("*");
        min = new Button("-");


        add(tekstvak);
        add(TV);
        add(keer);
        add(deel);
        add(plus);
        add(min);


    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());

        }
    }

    class TVlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Je kan deze regels ook samenvoegen
            getal2 = Double.parseDouble(TV.getText());

        }
    }

    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(TV.getText());
            getal = getal + getal2;
            tekstvak.setText("" + getal);
            getal2 = 0;
            TV.setText("");

        }
    }

    class Deel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble(TV.getText());
            getal = getal / getal2;
            tekstvak.setText("" + getal);
            getal2 = 0;
            TV.setText("");

        }
    }
}
