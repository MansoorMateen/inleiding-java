package h13;

import java.applet.*;
import java.awt.*;

public class h13P1 extends Applet {



    public void init(){

    }

    public void paint (Graphics g){
        int x1 = 100;
        int y1 = 100;
        int y12 = 80;
        int x2 = 80;
        int y2 = 110;
        int x3 = 50;
        int y3 = 50;
        Color bark = new Color(245,222,179);
        Color leaf = new Color(0,200,0);
        tekenBoom(g,x1,y1,x2,y2,x3,y3,bark,leaf,y12,6);
    }


    void tekenBoom(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3,Color bark,Color leaf,int y12,int keer) {


       //stam
        g.setColor(bark);
        g.fillRect(x1,y1,x2,y2);

        //bladeren
        g.setColor(leaf);
        x1 -= 50;
        for (int getal = 1 ;getal <= keer; getal++) {

            g.fillOval(x1, y12, x3, y3);
            x1 += 50 ;

            if (getal  == (keer/2)){
                x1 =100;
                y12 -= 10;

            }


        }
    }

}
