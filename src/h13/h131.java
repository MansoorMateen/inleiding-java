package h13;

import java.applet.*;
import java.awt.*;

public class h131 extends Applet {



    public void init(){

    }

    public void paint (Graphics g){
        int x1 = 100;
        int y1 = 100;
        int x2 = 500;
        int y2 = 100;
        int x3 = 500;
        int y3 = 500;
        tekenDriehoek(g,x1,y1,x2,y2,x3,y3);
    }


    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);
    }

}
