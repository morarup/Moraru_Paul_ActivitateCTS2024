package classes.factory;

import classes.Durere;
import classes.MedicamentFarmacie;

public class DurereFactory implements MedicamentFactory{

    @Override
    public MedicamentFarmacie createMedicament(String denumire, double pret) {
        return new Durere(denumire, pret);
    }
}
