package h06;

//Schrijf een applet waarin
//je twee ints met positieve waarden bij elkaar optelt en er een negatieve int uit komt.

import java.applet.Applet;
import java.awt.Graphics;

public class h063 extends Applet {
    int positief;
    int positief2;
    int negatief;


    public void init() {
        positief = 5;
        positief2 =2;
        negatief = -(positief+positief2);
    }

    public void paint(Graphics g) {
        g.drawString(positief + " + " + positief2 +" = " + negatief ,10,10);
    }
}