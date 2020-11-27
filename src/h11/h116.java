package h11;
import java.awt.*;
import java.applet.*;

public class h116 extends Applet {
    int times =5;

    int x =10;
    int high =20;

    public void paint(Graphics g){

        while (times>0){
            g.drawOval(x,x,high,high);
            times--;
            x-=5;
            high+=10;




        }
        x=10;
        high =20;
        times =5;

    }

}
