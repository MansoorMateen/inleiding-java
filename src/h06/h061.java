package h06;


//Met z'n vieren (Jan, Ali, Jeannette en jij)
// hebben jullie een karwei verricht en daarmee 113 euro verdiend.
// Schrijf een applet waarin je een berekening maakt om het geld zo eerlijk mogelijk te verdelen.
// In het venster van de applet komen de vier namen onder elkaar te staan
// met daarachter het bedrag dat een ieder krijgt.


import java.applet.Applet;
        import java.awt.*;

public class h061 extends Applet {
    double totaaltijd;
    double totaalwinst;
    double Mansoortijd;
    double Jantijd;
    double Alitijd;
    double Jeannettetijd;


    public void init() {

        totaaltijd  = 100;
        totaalwinst = 113;
        Mansoortijd = 25;
        Jantijd =30;
        Alitijd = 10;
        Jeannettetijd =35;
        Mansoortijd=Math.round(Mansoortijd*100.0)/100.0;
    }
    public void paint(Graphics g) {
        g.drawString("Mansoor winst = " +(totaalwinst * Mansoortijd /totaaltijd ) +"  EURO"
                ,10,10);
        g.drawString("Jan winst =  " + (totaalwinst * Jantijd /totaaltijd ) +"  EURO" ,10,30 );
        g.drawString("Ali winst = " + (totaalwinst * Alitijd /totaaltijd ) +"  EURO",10,50 );
        g.drawString("Jeannette winst = " + (totaalwinst * Jeannettetijd /totaaltijd ) +"  EURO",10,70 );
    }

}