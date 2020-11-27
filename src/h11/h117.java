package h11;
import java.awt.*;
import java.applet.*;

public class h117 extends Applet {
    int times =50;

    int x =150;
    int high =10;
    int y= 150;

    public void paint(Graphics g){

        while (times>0){
            g.drawOval(x,y,high,high);
            times--;
            x-=2;
            high+=4;
            y-=2;




        }
        x=150;
        high =10;
        y=150;
        times =50;

    }

}
