package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h11P2 extends Applet {
    Button OK;
    int teller = 1;
    int nummer = 1;

    public void init(){
        OK = new Button("ok");
        OK.addActionListener(new OKB());
        add(OK);


    }

    class OKB implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;

            if(teller>10){
                teller = 1;
            }

            repaint();

        }

    }
    public void paint(Graphics g){

        int y = 10;
        while (nummer <= 10){

            g.drawString(nummer + " * " + teller + " = " + teller*nummer,10,y);
            y+=10;
            nummer++;





        }
        nummer = 1;
        y = 10;
    }
}
