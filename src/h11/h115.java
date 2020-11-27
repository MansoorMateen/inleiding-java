package h11;

import java.awt.*;
import java.applet.*;

public class h115 extends Applet {


    int times =5;
    int x =10;
    int y = 10;

    public void paint(Graphics g){
        while(times>0){
            g.drawRect(x,y,10,10);
            x+=10;
            y+=10;
            times--;

        }
        x=10;
        y=10;
        times=5;


    }

}
