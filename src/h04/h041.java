package h04;


    //Voorbeeld 4.1

/*
Wat is een platform?

Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?

Wat is bytecode?

Wat doet JVM?

Met welke methode kun je een vierkant tekenen?

Noem drie methodes waarmee je een cirkel kunt tekenen

Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?

 */
import java.awt.*;
import java.applet.*;

    public class h041 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.blue);
            g.drawLine(50, 60, 270, 120);
            g.drawLine(50, 210, 270, 120);
            g.drawLine(50, 60, 50, 210);
        }
    }

