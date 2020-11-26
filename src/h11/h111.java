package h11;
import java.awt.*;
import java.applet.*;

public class h111 extends Applet{

    int teller;
    int x = 0;
    int y = 0;


    public void paint(Graphics g){
        while(teller <10){
            g.drawLine(x,10,x,50);
            x+=10;
            teller++;


        }

        x= 0;
        teller = 0;
    }


}
