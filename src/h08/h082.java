package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h082 extends Applet {

    int Man;
    int manle;
    int vrw;
    int vrwle;

    int totaal;

    Button man;
    Button ManL;
    Button Vrouw;
    Button VrouwL;
    Button reset;

    public void init() {

        totaal = Man + manle + vrwle + vrw;
        man = new Button();
        ManL = new Button();
        Vrouw = new Button();
        VrouwL = new Button();
        reset = new Button();
        man.setLabel( "Man geen leerling" );
        ManL.setLabel("man leerling");
        Vrouw.setLabel("Vrouw geen leerling");
        VrouwL.setLabel("vrouw leerling");
        reset.setLabel("reset");
        man.addActionListener(new Mknop());
        ManL.addActionListener(new MLknop());
        Vrouw.addActionListener(new Vknop());
        VrouwL.addActionListener(new VLknop());
        reset.addActionListener(new Rknop());
        add(man);
        add(ManL);
        add(Vrouw);
        add(VrouwL);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString( " zoveel mannen die geen leerling zijn "+ Man, 50, 90 );
        g.drawString( " zoveel mannen die leerling zijn "+ manle, 50, 110 );
        g.drawString( " zoveel Vrouwen die geen leerling zijn "+ vrw, 50, 130 );
        g.drawString( " zoveel Vrouwen die leerling zijn "+ vrwle, 50, 150 );
        g.drawString( " totaal zoveel "+ totaal, 50, 170 );
    }

    class Mknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Man = Man + 1;
            totaal ++;
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
    class MLknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            manle = manle + 1;
            totaal ++;
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
            repaint(totaal);
        }
    }
    class Vknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrw = vrw + 1;
            totaal++;
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
            repaint(totaal);
        }
    }
    class VLknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrwle = vrwle + 1;
            totaal++;
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
    class Rknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Man = 0;
            vrw =0;
            manle =0;
            vrwle =0;
            totaal =0;
            repaint();
        }
    }



}

