package PlayerMultimediale;

import PlayerMultimediale.Intefaces.Luminosità;

public class Immagine extends Player implements Luminosità {
    private int luminosità;

    public Immagine(String _title) {
        super(_title);
        luminosità = 10;
    }

    public void play() {
        System.out.println ("Non puoi riprodurre un immagine! Puoi visualizzarla utilizzando show()" );
    }

    public void show() {
        String asterischi = "";
        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }
        System.out.println(title + " " + asterischi);
    }


    public void aumentaLuminosità(int piu) {
        if(luminosità + piu < 50) {
            luminosità = luminosità + piu;
            System.out.println("Luminosità al:" + luminosità);
        } else {
            System.out.println("Luminosità al massimo, mi servono gli occhiali da sole!");
        }
    }



    public void abbassaLuminosità(int meno) {

        if (luminosità - meno > 0) {
            luminosità = luminosità - meno;
            System.out.println("Luminosità al: " + luminosità);
        } else {
            System.out.println("Luminosità al minimo, sei per caso sensibile alla luce?!?!??");
        }
    }
}
