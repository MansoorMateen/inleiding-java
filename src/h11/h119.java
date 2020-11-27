package h11;
import java.awt.*;
import java.applet.*;

public class h119 extends Applet {

    public void paint(Graphics g) {
        //de x en y coordinaten
        setBackground(Color.gray);
        int x = 50;
        int y = 50;
        int breedte =50;
        int hoogte =50;
            for(int kolom2 = 0; kolom2<8; kolom2++){
                if(kolom2 % 2 ==0) {
                    for (int kolom = 0; kolom < 8; kolom++) {
                        if (kolom % 2 != 0) {
                            g.setColor(Color.white);
                            g.fillRect(x, y, breedte, hoogte);
                        } else {
                            g.setColor(Color.black);
                            g.fillRect(x, y, breedte, hoogte);
                        }
                        x += breedte;
                    }
                }
                else {
                    for (int kolom = 0; kolom < 8; kolom++) {
                        if (kolom % 2 == 0) {
                            g.setColor(Color.white);
                            g.fillRect(x, y, breedte, hoogte);
                        } else {
                            g.setColor(Color.black);
                            g.fillRect(x, y, breedte, hoogte);
                        }
                        x += breedte;
                    }

                }
                    x = 50;
                    y+= hoogte;
            }

       }




    }
