package h04;

//Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.

import java.awt.*;
import java.applet.*;

public class h045 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,50,100,360,360);
    }
}