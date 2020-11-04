package h06;



//Schrijf een applet,
// waarin berekend wordt hoeveel seconden er in een uur,
// dag en jaar gaan en de uitkomst van de berekening in het venster van de applet toont.


import java.applet.Applet;
import java.awt.*;

public class h062 extends Applet {
    int seconde;
    int minuut;
    int uur;
    int dag;
    int maand;
    int jaar;
    int jaar2;


    public void init() {

        seconde =1;
        minuut = seconde * 60;
        uur = minuut * 60;
        dag = uur *24;
        maand = dag*30;
        jaar = dag* 365;
        jaar2 = maand*12;
    }
    public void paint(Graphics g) {
        g.drawString("1 seconde bestaat uit " + seconde + " seconde" ,10,10);
        g.drawString("1 minuut bestaat uit " + minuut + " secondes" ,10,30);
        g.drawString("1 uur bestaat uit " + uur + " secondes" ,10,50);
        g.drawString("1 dag bestaat uit " + dag + " secondes" ,10,70);
        g.drawString("1 maand bestaat uit " + maand + " secondes" ,10,90);
        g.drawString("1 jaar bestaat uit " + jaar + " secondes" ,10,110);
        g.drawString("1 jaar bestaat uit " + jaar + " secondes" ,10,90);    }

}