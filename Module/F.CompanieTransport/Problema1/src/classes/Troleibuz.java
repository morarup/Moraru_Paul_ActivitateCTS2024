package classes;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int id, int numarStatii) {
        super(id, numarStatii);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mijlocul de transport cu id-ul " + getId() + " este un autobuz.");
    }
}
