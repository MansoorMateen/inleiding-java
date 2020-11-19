package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class h105 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String tekst;
    Button OK;
    double totaal;
    int cijfers;




    public void init() {
        OK = new Button("OK");
        tekstvak = new TextField("", 2);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        OK.addActionListener(new OKlisten());
        add(label);
        add(tekstvak);
        add(OK);
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50,80);
        tekst =("");



    }

    class OKlisten implements ActionListener{
        public void actionPerformed(ActionEvent e){



            if (totaal/cijfers >= 1 && totaal/cijfers < 5.5)
            { tekst = ("Onvoldoende het is een " + (totaal/cijfers)); }
            System.out.println(totaal/cijfers );

            if (totaal/cijfers>= 5.5 && totaal/cijfers <= 10)
            { tekst = ("Voldoende het is een " + (totaal/cijfers)); }

            if (totaal/cijfers < 1 || totaal/cijfers > 10)
            { tekst = ("Verkeerd getal" + (totaal/cijfers)); }

            repaint();
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            totaal = getal + totaal;
            cijfers = cijfers + 1;
            System.out.println(cijfers);
            if (getal < 5.5 && getal >= 1 ){
                tekst = "Onvoldoende";

            }

            if (getal >= 5.5 && getal <= 10)  {
                tekst = "Voldoende";
            }

            if (getal < 1 || getal > 10)  {
                tekst = "Verkeerd getal";
                totaal = totaal - getal;
                cijfers = cijfers - 1;
            }
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
