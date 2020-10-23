package h04;

import java.applet.Applet;
import java.awt.*;


import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //text
        g.drawString("Lijn",105,30);
        g.drawString("Rechthoek",90,155);
        g.drawString("Afgeronde Rechthoek",60,280);
        g.drawString("Gevulde Rechthoek Met Ovaal",250,155);
        g.drawString("Gevulde Ovaal",300,280);
        g.drawString("Taartpunt Met Ovaal Eromheen",500,155);
        g.drawString("Cirkel",560,280);

        //vormen
        g.drawLine(10,10,210,10);
        g.drawRect(10,40,200,100);
        g.drawRoundRect(10,160,200,100,30,30);
        g.setColor(Color.magenta);
        g.fillRect(250,40,200,100);
        g.fillArc(250,160,200,100,0,360);
        g.fillArc(490,40,200,100,0,45);
        g.setColor(Color.black);
        g.drawArc(250,40,200,100,0,360);
        g.drawArc(490,40,200,100,0,360);
        g.drawArc(530,160,100,100,0,360);


    }
}