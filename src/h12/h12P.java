package h12;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h12P extends Applet {
    int y;
    TextField naam;
    TextField nummer;
    String[] namen;
    String[] nummers;
    Button ok;

    int teller = 0;

    public void init(){
        namen = new  String[10];
        nummers = new  String[10];
        ok = new Button("ok");
        naam = new TextField("",10);
        nummer = new TextField("",10);


        ok.addActionListener(new buttons());
        add(ok);
        add(naam);
        add(nummer);
    }
    class buttons implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            if (teller <= namen.length){

                namen[teller] = naam.getText();
                nummers[teller] = nummer.getText();
                System.out.println(namen[teller] + "");
                System.out.println(nummers[teller] + "");
                teller++;

            }
            else {repaint();}


        }
    }

    public void paint(Graphics g) {

        if (teller >= 10) {

            int teken = 0;
            for (teken = 0; teken < namen.length; teken++) {
                g.drawString("" + namen[teken], 50, 100 + teken * 40);
                g.drawString("" + nummers[teken], 100, 115 + teken * 40);

            }

        }
    }

 }
