package main;

import builder.classes.Rezervare;
import builder.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder()
                .setAsezareLaGeam(true)
                .setScauneErgonomice(false)
                .setDecorMasa(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica("Hip-Hop")
                .build();
        System.out.println(rezervare1);

        Rezervare rezervare2 = new RezervareBuilder()
                .setAsezareLaGeam(false)
                .setScauneErgonomice(true)
                .setDecorMasa(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica("Rock")
                .build();
        System.out.println(rezervare2);
    }
}