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

    public class h04 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawRoundRect(20, 20, 100, 50, 10, 10);
            g.fillRect(20, 80, 100, 50);
        }
    }

