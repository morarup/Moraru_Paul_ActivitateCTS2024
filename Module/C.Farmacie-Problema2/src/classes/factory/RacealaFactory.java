package classes.factory;

import classes.MedicamentFarmacie;
import classes.Raceala;

public class RacealaFactory implements MedicamentFactory{
    @Override
    public MedicamentFarmacie createMedicament(String denumire, double pret) {
        return new Raceala(denumire, pret);
    }
}
