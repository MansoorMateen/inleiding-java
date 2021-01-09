package h13;

import java.applet.*;
import java.awt.*;
public class test13 extends Applet {

    int keer = 10;
    int x = 20;
    int y = 20;
    String a = "Mansoor";
    public void init(){

    }

    public void paint(Graphics g){
     for (keer = 10;keer>=0; keer--){
         g.drawString(a,x,y);
         if (keer == 6){
             a = "Jorn";
         }
         else {a = "Mansoor";}

         y+=10;

     }
    }

}
