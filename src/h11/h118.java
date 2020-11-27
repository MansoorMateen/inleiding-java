package h11;
import java.awt.*;
import java.applet.*;

public class h118 extends Applet {
    int times =100;

    int x =150;
    int high =10;
    int y= 150;

    public void paint(Graphics g){

        while (times>0){
            g.drawOval(x,y,high,high);
            times--;

            high+=2;





        }
        x=150;
        high =10;
        y=150;
        times =100;

    }

}
