package classes.factory;

import classes.MedicamentFarmacie;

public interface MedicamentFactory {
    public MedicamentFarmacie createMedicament(String denumire, double pret);
}
