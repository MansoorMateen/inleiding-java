package h11;
import java.awt.*;
import java.applet.*;

public class h112 extends Applet {

    int teller =20;
    int y =10;

    public void paint(Graphics g){

        while(teller>=10){
            g.drawString(teller+"",0,y);
            y+=15;
            teller--;

        }
        y=10;
        teller = 20;
    }



}
