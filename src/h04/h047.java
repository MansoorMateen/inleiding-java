package h04;

//Teken de zijde waarop de vier van een dobbelsteen staat


import java.awt.*;
import java.applet.*;

public class h047 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       g.drawRoundRect(40,40,100,100,20,20);
       g.fillArc(50,50,20,20,360,360);
       g.fillArc(50,110,20,20,360,360);
       g.fillArc(110,50,20,20,360,360);
       g.fillArc(110,110,20,20,360,360);
    }
}