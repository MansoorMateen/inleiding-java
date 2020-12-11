package h13;

import java.applet.Applet;
import java.awt.*;


public class h13p2 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        int x1 = 100;
        int y1 = 100;
        int y12 = 80;
        int x2 = 80;
        int y2 = 110;
        int x3 = 50;
        int y3 = 50;

        Color bark = new Color(245, 222, 179);
        Color leaf = new Color(0, 200, 0);
        tekenBoom(g, x1, y1, x2, y2, x3, y3, bark, leaf, y12, 3);
    }


    void tekenBoom(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, Color bark,
                   Color leaf, int y12, int bladeren) {

        for (int rijen = 0; rijen <= 1; rijen++) {
            if (rijen == 1){
                y1 = 300;
                y12 = 280;
                x1 =100;


            }
            for (int keer=0;keer<= 5;keer++){
                //stam
                g.setColor(bark);
                g.fillRect(x1, y1, x2, y2);

                //bladeren
                g.setColor(leaf);
                x1 -= 50;
                for (int getal = 0; getal <= bladeren; getal++) {

                    g.fillOval(x1, y12, x3, y3);
                    x1 += 50;

                    if (getal == (bladeren / 2)) {
                        x1 -= 50;


                    }

                }
                x1 += 75;
            }
        }

    }
}