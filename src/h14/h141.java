package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class h141 extends Applet{

    String[] Kleuren ={"Harten","Schoppen","Ruiten","Klaveren","Joker"};
    String[] Kaarten = {"aas","2","3","4","5","6","7","8","9","10","boer","vrouw","heer",""};
    double r;
    int kleur;
    int kaart ;
    Button knop;
    Boolean Joker = false;


    public void init(){
        knop = new Button("druk");

        knop.addActionListener(new Knop());
        add(knop);


    }

    class Knop implements ActionListener{
        public void actionPerformed(ActionEvent e){

            repaint();
            r = Math.random();
            kleur =(int) (r*5);
            kaart = (int) (r*13);

            if (kleur == 4){
                Joker = true;
            }
            else {Joker = false;}

            if (Joker){
                kaart = 13;
            }

        }
    }



    public void paint(Graphics g){

        g.drawString(Kleuren[kleur]+ " " + Kaarten[kaart],30,40 );

    }

}


