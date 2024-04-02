package main;

import classes.MedicamentFarmacie;
import classes.factory.Factory;
import classes.factory.TipMedicament;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        try{
            MedicamentFarmacie durere = factory.createMedicament(TipMedicament.DURERE, "Nurofen", 22.5);
            durere.afisareDetalii();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}