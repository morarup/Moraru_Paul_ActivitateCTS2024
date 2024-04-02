package classes.factory;

import classes.Body;
import classes.Durere;
import classes.MedicamentFarmacie;
import classes.Raceala;

public class Factory {
    public MedicamentFarmacie createMedicament(TipMedicament tipMedicament, String denumire, double pret)
            throws Exception{
        switch (tipMedicament){
            case RACEALA:
                return new Raceala(denumire,pret);
            case DURERE:
                return new Durere(denumire, pret);
            case BODY:
                return new Body(denumire, pret);
            default:throw new Exception("Tipul nu a fost gasit");
        }
    }
}
