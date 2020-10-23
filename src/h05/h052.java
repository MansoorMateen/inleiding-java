package h05;



//Drie kinderen hebben het volgende gewicht:
//Valerie: 40 kg
//Jeroen: 100 kg
//Hans: 80 kg
//Maak van deze gegevens een staafdiagram,
// waarbij elke kolom een eigen kleur heeft.
// De namen van de kinderen staan onder het staafdiagram
// en de verdeling van de schaal staat naast de diagram met daarbij om de 20 de verdeling.

import java.awt.*;
import java.applet.*;

public class h052 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    public void init() {
       Valerie = 80;
       Jeroen = 100;
       Hans = 80;

    }

    public void paint(Graphics g) {
        //namen
        g.drawString("Valerie",150,130);
        g.drawString("Jeroen",100,130);
        g.drawString("Hans",200,130);

        //verdeling
        g.drawString("0",75,110);
        g.drawString("20",75,90);
        g.drawString("40",75,70);
        g.drawString("60",75,50);
        g.drawString("80",75,30);
        g.drawString("100",75,10);

        g.setColor(Color.red);
        g.fillRect(150,110 - Valerie,35,Valerie);
        g.setColor(Color.orange);
        g.fillRect(100,110 - Jeroen,35,Jeroen);
        g.setColor(Color.blue);
        g.fillRect(200,110 - Hans,35,Hans);

    }
}