package main;

import classes.MedicamentFarmacie;
import classes.Durere;
import classes.factory.DurereFactory;
import classes.factory.MedicamentFactory;
import classes.factory.RacealaFactory;

public class Main {
    public static void main(String[] args) {
        MedicamentFactory fabricaDurere = new DurereFactory();
        MedicamentFarmacie durere = fabricaDurere.createMedicament("Nurofen", 20.1);
        MedicamentFactory fabricaRaceala = new RacealaFactory();
        MedicamentFarmacie raceala = fabricaRaceala.createMedicament("Paracetamol", 33.5);
        durere.afisareDetalii();
        raceala.afisareDetalii();
    }
}