package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class h126 extends Applet {
    Boolean gevonden = false;
    Button ok;
    TextField text;
    int[] getal = {10,20,10,40,10};
    int zoeken = 0;
    int teller = 0;
    int hoeVaak;


    public void init() {
        ok = new Button("ok");
        text = new TextField("",10);

        ok.addActionListener(new OkListener());
        add(ok);
        add(text);


    }
    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller = 0;
            hoeVaak = 0;
            gevonden = false;
            String s = text.getText();
            zoeken = Integer.parseInt(s);
            System.out.println(zoeken);
            while(teller< getal.length){
                System.out.println(teller);
                if (getal[teller] == zoeken){
                    gevonden = true;
                    hoeVaak++;
                    System.out.println(hoeVaak);

                }

                System.out.println(gevonden);
                teller++;
            }
            repaint();
        }
    }

    public void paint(Graphics g){

        if (gevonden == true){
            g.drawString("waarden gevonden " + zoeken + " het aantal is " + (hoeVaak) ,40,40 );


        }
        else {
            g.drawString("waarde niet gevonden",40,40);
        }

    }


}
