package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h081 extends Applet {
    TextField tekstvak;
    String getal;

    Button OK;
    Button reset;

    public void init() {
        tekstvak = new TextField("", 20);

        getal = ("typ iets in en druk op ok ");
        add(tekstvak);
        OK = new Button();
        reset = new Button();
        OK.setLabel( "OK" );
        reset.setLabel("reset");
        OK.addActionListener(new Oknop());
        reset.addActionListener(new Rknop());
        add(OK);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString( getal, 50, 60 );
    }

    class Oknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Je kan deze regels ook samenvoegen
            getal = (tekstvak.getText());
            repaint();
        }
    }

    class Rknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            getal = "";
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();

            repaint();
        }
    }

}

