package it.Adiener.core;

import PlayerMultimediale.Audio;
import PlayerMultimediale.Immagine;
import PlayerMultimediale.Player;
import PlayerMultimediale.Video;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Audio myAudio = new Audio ( "Wuki Wuki", 30 );
        Immagine myImg = new Immagine ( "Io con il mio cane Bobby" );
        Video myVideo = new Video ("Tape Sun", 23);
        Audio myAudio2 = new Audio ( "Compleanno", 15 );
        Video myVideo2 = new Video ("Cha Cha Cha", 40);

        Player[] playlist = {myVideo, myAudio, myImg, myAudio2, myVideo2};

        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Benvenuti ecco la vostra playList" );

        getPlayList ( playlist );

        System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );

        int numeroTraccia = Integer.parseInt( scanner.nextLine() );

        if (numeroTraccia == 0) {
            System.out.println ("Good bye" );
            scanner.close ();
        } else {
            while (numeroTraccia != -1 ) {

                switch (numeroTraccia) {
                    case 0:
                        System.out.println ( "Good bye!!" );
                        numeroTraccia = -1;
                        break;
                    case 1:
                        ((Video)playlist[0]).play ();

                        System.out.println ( "Riprodurre ancora? si o no?" );
                        String input0 = scanner.nextLine();

                        if (input0.equals ( "si" )) {
                            numeroTraccia = 1;
                        } else {
                            getPlayList ( playlist );
                            System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                            numeroTraccia = Integer.parseInt( scanner.nextLine() );
                        }
                        break;

                    case 2:
                        ((Audio)playlist[1]).play ();

                        System.out.println ( "Riprodurre ancora? si o no?" );
                        String input2 = scanner.nextLine();

                        if (input2.equals ( "si" )) {
                            numeroTraccia = 2;
                        } else {
                            getPlayList ( playlist );
                            System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                            numeroTraccia = Integer.parseInt( scanner.nextLine() );
                        }
                        break;

                    case 3:
                        ((Immagine)playlist[2]).show ();

                        System.out.println ( "Riprodurre ancora? si o no?" );
                        String input3 = scanner.nextLine();

                        if (input3.equals ( "si" )) {
                            numeroTraccia = 3;
                        } else {
                            getPlayList ( playlist );
                            System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                            numeroTraccia = Integer.parseInt( scanner.nextLine() );
                        }
                        break;

                    case 4:
                        ((Audio)playlist[3]).play ();

                        System.out.println ( "Riprodurre ancora? si o no?" );
                        String input4 = scanner.nextLine();

                        if (input4.equals ( "si" )) {
                            numeroTraccia = 4;
                        } else {
                            getPlayList ( playlist );
                            System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                            numeroTraccia = Integer.parseInt( scanner.nextLine() );
                        }
                        break;

                    case 5:
                        ((Video)playlist[4]).play ();

                        System.out.println ( "Riprodurre ancora? si o no?" );
                        String input5 = scanner.nextLine();

                        if (input5.equals ( "si" )) {
                            numeroTraccia = 5;
                        } else {
                            getPlayList ( playlist );
                            System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                            numeroTraccia = Integer.parseInt( scanner.nextLine() );
                        }
                        break;

                    default:
                        System.out.println ( "scegli un numero valido!" );

                        getPlayList ( playlist );
                        System.out.println ("Scegli il numero da riprodurre, oppure 0 per uscire" );
                        numeroTraccia = Integer.parseInt( scanner.nextLine() );
                }

            }
        }



    }

    static void getPlayList(Player[] playlist) {
        for ( int i = 0; i < playlist.length; i++ ) {
            System.out.println ("" + (i + 1) + "." + playlist[i].getTitle () );
        }
    }
}
