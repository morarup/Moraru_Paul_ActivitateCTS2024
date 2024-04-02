package classes;

public class Raceala extends MedicamentFarmacie{

    public Raceala(String denumire, double pret){
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + getDenumire() + " este pentru raceala");
    }

}
