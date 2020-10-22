package h04;

//Teken een stoplicht

import java.awt.*;
import java.applet.*;

public class h046 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.fillArc(30,0,100,200,360,360);
        g.fillRect(60,190,40,300);
        g.setColor(Color.red);
        g.fillArc(50,20,50,50,360,360);
        g.setColor(Color.yellow);
        g.fillArc(50,80,50,50,360,360);
        g.setColor(Color.green);
        g.fillArc(50,140,50,50,360,360);

    }
}