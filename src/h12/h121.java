package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;
public class h121 extends Applet {

    Double[] salaris = { 100.0, 200.00, 111.11, 222.22,2.2,3.5,6.7,100.4,65.76,777.77};

    public void init() {
        Arrays.sort(salaris);
    }

    public void paint(Graphics g) {

        Double w = 0.0;
        Double gem;
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            w = w + salaris[teller];



            if (teller == 9) {
                gem = w/teller;
                g.drawString("" + gem, 100, 20 * teller + 20);
            }
        }
    }
}