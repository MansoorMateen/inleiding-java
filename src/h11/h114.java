package h11;
import java.awt.*;
import java.applet.*;

public class h114 extends Applet {

    int teller=1;
    int y=0;
    int tafel =3;

    public void paint(Graphics g){
        for(teller=1;teller<=10;teller++){
            g.drawString(teller+" * " + tafel+ " = "+ teller*tafel,10,y);
            y+=10;



        }
        y=10;
        teller = 1;


    }



}
