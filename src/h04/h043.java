package h04;

//Teken de Nederlandse vlag aan een vlaggenstok

import java.awt.*;
import java.applet.*;

public class h043 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.fillOval(100,100,15,100);
        g.setColor(Color.red);
        g.fillRect(110,100,35,10);
        g.setColor(Color.white);
        g.fillRect(110,110,35,10);
        g.setColor(Color.blue);
        g.fillRect(110,120,35,10);

    }
}