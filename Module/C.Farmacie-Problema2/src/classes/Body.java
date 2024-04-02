package classes;

public class Body extends MedicamentFarmacie{

    public Body(String denumire, double pret){
        super(denumire, pret);
    }
    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + getDenumire() + " este pentru body");
    }
}
