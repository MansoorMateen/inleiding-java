package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class h123 extends Applet {

   Button Ok;
    TextField[] text;
    int[] kopie;




    public void init() {
        Ok = new Button("ok");
        text = new TextField[5];
        kopie = new int[5];

        Ok.addActionListener(new OkListener());


        add(Ok);

        for(int teller = 0; teller < text.length; teller++) {
            text[teller] = new TextField("" ,10);
            add(text[teller]);
        }

    }
    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int teller = 0; teller < text.length; teller++) {

                String s = text[teller].getText();
                kopie[teller] = Integer.parseInt(s);

            }
            Arrays.sort(kopie);
            for (int teller = 0; teller < text.length; teller++) {
                text[teller].setText(kopie[teller]+"");


            }
        }
    }
}
