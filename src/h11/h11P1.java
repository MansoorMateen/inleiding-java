package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h11P1 extends Applet {
    Button OK;
    double teller = 0;
    int nummer = 1;
    TextField tekst;

    public void init(){
        OK = new Button("ok");
        tekst = new TextField("1",2);
        OK.addActionListener(new OKB());
        add(OK);
        add(tekst);


    }

    class OKB implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekst.getText();
            teller = Double.parseDouble(s);
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
