package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class h126 extends Applet {
    Boolean Gevonden = false;
    Button Ok;
    TextField text;
    int[] getal = {10,20,10,40,10};
    int zoeken = 0;
    int teller = 0;


    public void init() {
        Ok = new Button("ok");
        text = new TextField("",10);

        Ok.addActionListener(new OkListener());
        add(Ok);
        add(text);


    }
    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = text.getText();
            zoeken = Integer.parseInt(s);
            System.out.println(zoeken);
            while(teller< getal.length){
                System.out.println(teller);
                if (getal[teller] == zoeken){
                    Gevonden = true;
                    System.out.println(Gevonden);

                }
                else {
                    Gevonden = false;

                }
                teller++;
            }
            repaint();
        }
    }

    public void paint(Graphics g){

        if (Gevonden == true){
            int y = 40;
            g.drawString("waarden gevonden " + getal[teller] + " de index is " + (teller + 1) ,40,y );
            y=+10;
            Gevonden = false;
        }
        else {
            g.drawString("waarde niet gevonden",40,40);
        }

    }


}
