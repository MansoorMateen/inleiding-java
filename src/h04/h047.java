package h04;

//Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.

import java.awt.*;
import java.applet.*;

public class h047 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       g.drawRoundRect(40,40,100,100,20,20);

    }
}