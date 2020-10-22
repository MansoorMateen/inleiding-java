package h04;

    //Teken een huis met daarin tenminste één raam en een deur

    import java.awt.*;
    import java.applet.*;

public class h042 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRect(140,170,30,60);
        g.drawRect(110,120,200,110);
        g.drawRect(190,160,30,30);
        g.drawLine(110,120,210,10);
        g.drawLine(310,120,210,10);
    }
}
