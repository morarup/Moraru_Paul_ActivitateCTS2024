package classes.factory;

import classes.Body;
import classes.MedicamentFarmacie;

public class BodyFactory implements MedicamentFactory{
    @Override
    public MedicamentFarmacie createMedicament(String denumire, double pret) {
        return new Body(denumire, pret);
    }
}
