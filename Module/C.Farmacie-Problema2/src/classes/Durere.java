package classes;

public class Durere extends MedicamentFarmacie{

    public Durere(String denumire, double pret){
        super(denumire, pret);
    }
    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + getDenumire() + " este pentru durere");
    }
}
