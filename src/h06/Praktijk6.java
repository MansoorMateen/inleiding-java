package h06;

import java.applet.Applet;
import java.awt.*;



//Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.
//Schrijf een applet in Java,
//waarin van de bovenstaande cijfers het gemiddelde wordt uitgerekend
//dat gemiddelde met één decimaal op het scherm wordt getoond.
// Op het scherm komt te staan: Het gemiddelde is: 6.3.
// Het gemiddelde mag afgekapt worden en hoeft niet afgerond te worden.
// Als je klaar bent, lever je de broncode in bij je docent.
//
//Aanwijzing: Als je het gemiddelde hebt uitgerekend,
// komt er te staan 6.366666666...
// Door gebruik te maken van de eigenschappen van double en int kun je afkappen.
// Je moet het gemiddelde met 10 vermenigvuldigen en daarna converteren naar een int.
// Vervolgens terugconverteren naar een double en door 10 delen.

public class Praktijk6 extends Applet {
    double gemmidelde;
    double cijfer1;
    double cijfer2;
    double cijfer3;



    public void init() {
        cijfer1 =5.9;
        cijfer2 =6.3;
        cijfer3 =6.9;
        gemmidelde = (cijfer1+cijfer2+cijfer3)/3;

        gemmidelde = Math.floor(gemmidelde*10);
    }

    public void paint(Graphics g) {
        g.drawString("het gemmidelde is " + gemmidelde /10,10,10);
    }
}