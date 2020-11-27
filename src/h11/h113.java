package h11;

import java.awt.*;
import java.applet.*;

public class h113 extends Applet {
    int number=1;
    int number2 =0;
    int y=10;
    int teller=20;

    public void paint(Graphics g){
        String getal =("");
        while(teller >=0){
            if(teller %2==0){
                g.drawString(getal + number,10,y);
                teller--;
                number2 = number2 + number;
                y+=15;

            }
            else {
                g.drawString(getal + number2,10,y);
                teller--;
                number = number2 + number;
                y+=15;
            }
        }
        y= 10;
        teller = 20;
        number =1;
        number2 =0;



    }



}
