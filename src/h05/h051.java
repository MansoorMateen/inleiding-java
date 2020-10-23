package h05;


import java.applet.Applet;
import java.awt.*;


public class h051 extends Applet {
    Color Opvulkleur;
    Color Lijnkleur;
    int breedte;
    int hoogte;
    public void init() {
        Opvulkleur = Color.magenta;
        Lijnkleur  = Color.black;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {
        //text
        g.setColor(Lijnkleur);
        g.drawString("Lijn",105,30);
        g.drawString("Rechthoek",90,155);
        g.drawString("Afgeronde Rechthoek",60,280);
        g.drawString("Gevulde Rechthoek Met Ovaal",250,155);
        g.drawString("Gevulde Ovaal",300,280);
        g.drawString("Taartpunt Met Ovaal Eromheen",500,155);
        g.drawString("Cirkel",560,280);

        //vormen
        g.drawLine(10,10,breedte,10);
        g.drawRect(10,40,breedte,hoogte);
        g.drawRoundRect(10,160,breedte,hoogte,30,30);
        g.setColor(Opvulkleur);
        g.fillRect(250,40,breedte,hoogte);
        g.fillArc(250,160,breedte,hoogte,0,360);
        g.fillArc(490,40,breedte,hoogte,0,45);
        g.setColor(Lijnkleur);
        g.drawArc(250,40,breedte,hoogte,0,360);
        g.drawArc(490,40,breedte,hoogte,0,360);
        g.drawArc(530,160,breedte/2,hoogte,0,360);


    }
}