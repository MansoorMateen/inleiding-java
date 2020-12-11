package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h133 extends Applet {
    Button een;
    Button twee;
    boolean bak = false;
    boolean cement = false;

    public void init(){
    een = new Button("1");
    twee = new Button("2");

    een.addActionListener(new Baksteen());
    twee.addActionListener(new Cement());

    add(een);
    add(twee);
    }
    class Baksteen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           cement = false;
           bak = true;

           repaint();
        }
    }
    class Cement implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            bak = false;
            cement = true;
            repaint();
        }
    }

    public void paint (Graphics g){
        int x1 = 20;
        int y1 = 20;
        int x2 = 40;
        int y2 = 40;
        int afstand = 45;
        if (bak || cement) {
            tekenmuur(g, x1, y1, x2, y2, 12, afstand);
        }
    }


    void tekenmuur(Graphics g,int x1, int y1, int x2, int y2, int keer, int afstand) {
        if (cement){
            x1 =(40);
            x2 =(60);
            y1 =(40);
            y2 =(60);
            afstand =(65) ;


        }

        for(int getal = 1; getal < keer + 1; getal++){
            if (bak) {
                g.setColor(Color.red);
            }
            if (cement){
                g.setColor(Color.darkGray);
            }
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1,y1,x2,y2);
            x1 += afstand;

            if (getal % 3 == 0 ){
                y1 +=afstand ;
                if (bak){
                  x1 = 20;
                }
                else {
                    x1 = 40;
                }



            }

        }
    }

}
