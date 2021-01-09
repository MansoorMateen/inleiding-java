package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class h142 extends Applet {

    String[] Kleuren ={"Harten","Schoppen","Ruiten","Klaveren"};
    String[] Kaarten = {"aas","2","3","4","5","6","7","8","9","10","boer","vrouw","heer"};
    String[] deck = new String[52];
    String[] player1 = new String[13];
    String[] player2 = new String[13];
    String[] player3 = new String[13];
    String[] player4 = new String[13];
    int kleur = 0;
    int kaart = 0 ;
    int getal = 0;
    int teken = 0;
    Button knop;
    private AudioClip sound;



        public void init(){

            sound = getAudioClip(getDocumentBase(), "resources/applaus.wav");


            knop = new Button("druk");

            knop.addActionListener(new Knop());
            add(knop);


        }

        class Knop implements ActionListener {
            public void actionPerformed(ActionEvent e){
                getal = 0;
                deck = new String[52];

                for (kleur = 0; kleur< Kleuren.length;kleur++) {
                    for ( kaart = 0; kaart < Kaarten.length ; kaart++) {

                        deck[getal] = Kleuren[kleur] + " " + Kaarten[kaart];
                        getal++;






                    }
                    if (kaart > Kaarten.length){kaart = 0;}
                }


                for (int keer = 0; keer<13;keer++) {
                        teken = 0;
                      player1[keer] = deelKaart();
                      player2[keer] = deelKaart();
                      player3[keer] = deelKaart();
                      player4[keer] = deelKaart();

                }



                repaint();
            }

        }



        public void paint(Graphics g){

            for (int keer =1; keer < 5;keer++) {
                g.drawString("player" + keer,100 * (keer),40 );
            }
            for ( teken = 0; teken<player1.length; teken++) {
                int x = 100;
                int y = 70;
                g.drawString("" + player1[teken], x, y * (teken+1));
                g.drawString("" + player2[teken], x*2, y * (teken+1));
                g.drawString("" + player3[teken], x*3, y * (teken+1));
                g.drawString("" + player4[teken], x *4, y * (teken+1));
            }
        sound.play();

        }
    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart1 = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart1;
    }
    }



