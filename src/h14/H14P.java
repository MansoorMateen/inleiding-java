package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14P extends Applet {
    int pc = 0;
 int kruis = 23;
 int beurt = 1;
 Button ok;
 TextField tekstvak;
 int getal;
 String isx ="X";
 Boolean knop = false;

    public void init(){
        ok = new Button("ok");
        tekstvak = new TextField("",5);
        ok.addActionListener(new Oklisten());
        add(tekstvak);
        add(ok);


    }

    class Oklisten implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            getal = Integer.parseInt( s );


        if (kruis<0){
            getal = 0;
            kruis = 23;
            pc = 0;
        }
         knop = true;
            repaint();

        }

    }

    public void paint(Graphics g){
        int x = 20;
        int y = 20;

        if (getal == 1){
            beurt++;
              kruis= kruis - 1;

        }
        if (getal == 2){
            beurt++;
            kruis-= 2;

        }
        if (getal == 3){
            beurt++;
            kruis-= 3;

        }

        if (beurt %2 ==0 && kruis==0 ) {
            g.drawString("pc wint",100,50);
        }
        if (beurt %2 !=0 && kruis==0 ) {
            g.drawString("jij wint",100,50);
        }

        if (knop){
        if (getal<=0||getal>=4 && kruis>0){
            g.drawString("verkeerd getal",100,50);


        }
        }

        if (beurt %2 == 0){
            int[] doelen ={21, 17, 13,9,5,1};

            getal = (kruis - doelen[pc]);
            kruis= kruis - getal;

            if (kruis == doelen[pc]){pc++;}
            beurt++;

            g.drawString("Pc heeft "+ getal +" kruisen gepakt",50,50);

        }


        for (int teken = 1;teken<=kruis; teken++){
            g.drawString(isx,x,y);
            x+=20;
            if (teken %4 ==0){
                y+=20;
                x= 20;
            }
        }

        
    }
}
