package h13;

import java.applet.*;
import java.awt.*;

public class h132 extends Applet {



    public void init(){


    }

    public void paint (Graphics g){
        int x1 = 20;
        int y1 = 20;
        int x2 = 40;
        int y2 = 40;
        Color muur = new Color(255,0,0);
        tekenmuur(g,muur,x1,y1,x2,y2,12);

    }


    void tekenmuur(Graphics g,Color muur,int x1, int y1, int x2, int y2, int keer) {

        for(int getal = 1; getal < keer + 1; getal++){
            g.setColor(muur);
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1,y1,x2,y2);
            x1 += 45;

            if (getal % 3 == 0 ){
                y1 += 45;
                x1 = 20;



            }

        }
    }

}
