package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h083 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double btw;
    Button OK;


    public void init() {
        OK = new Button("OK");
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        OK.addActionListener(new OK());
        add(label);
        add(OK);
        add(tekstvak);

        btw= 1.21;

    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal * btw, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

    class OK implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
