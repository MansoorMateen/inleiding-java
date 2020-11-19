package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class h10P extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String tekst;
    int cijfers;




    public void init() {
        tekstvak = new TextField("", 2);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {

        g.drawString(tekst , 50,80);
        tekst =("");



    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            cijfers = (int) getal;
            System.out.println(cijfers);
            if (cijfers >=1 && cijfers <=3  ){
                tekst = "Slecht " + cijfers;

            }

            if (cijfers == 4 ){
                tekst = "Onvoldoende " + cijfers;

            }
            if (cijfers == 5 ){
                tekst = "matig " + cijfers;

            }
            if (cijfers >=6 && cijfers <=7  ){
                tekst = "Voldoende " + cijfers;

            }
            if (cijfers >=8 && cijfers <=10  ){
                tekst = "Goed " + cijfers;

            }

            if (cijfers < 1 || cijfers > 10)  {
                tekst = "Verkeerd getal " + cijfers;
            }
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}
