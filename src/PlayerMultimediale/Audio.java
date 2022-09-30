package PlayerMultimediale;
import PlayerMultimediale.Intefaces.Volume;


public class Audio extends Player implements Volume {
    private int volume;

    public Audio(String _title, int _durata) {
        super(_title, _durata);
        this.volume = 6;
        this.tipo = "AUDIO";
    }

    public String getTipo() {
        return this.tipo;
    }


    public void play() {

        for ( int i = 0; i <= durata; i++ ) {
            String vol = "";
            String singleVolume = "!";

            for ( int l = 0; l <= this.volume; l++ ) {
                vol = vol + singleVolume;
            }

            System.out.println (getTitle () + vol  );
        }

    }

    public void alzaVolume(int su) {
        if( volume < 100) {
            volume = volume + su;

            play ();
        } else {
            System.out.println ("Volume al massimo!tunz tunz tunz");
        }
    }

    public void abbassaVolume(int giu) {
        if(volume > 0 ) {
            volume = volume - giu;

            play ();
        } else {
            System.out.println ("Volume al massimo!tunz tunz tunz");
        }
    }
}
