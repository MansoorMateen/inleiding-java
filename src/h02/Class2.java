package h02;

import java.awt.*;



import java.applet.*;

    //een klasse met de naam Show van het type Applet
    public class Class2 extends Applet {

        public void init() {
            setBackground(Color.white);
        }

        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Mansoor!!", 50, 60);
            g.setColor(Color.red);
            g.drawString("Mateen??",50,100);
        }


    }



