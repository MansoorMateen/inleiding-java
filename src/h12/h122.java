package h12;

import java.applet.*;
import java.awt.*;

public class h122 extends Applet {

    Button[] ok;
    public void init() {
        ok = new Button[25];

        for(int teller = 0; teller < ok.length; teller++) {

            ok[teller] = new Button(" " + (teller + 1));
            add(ok[teller]);
        }

    }
}
