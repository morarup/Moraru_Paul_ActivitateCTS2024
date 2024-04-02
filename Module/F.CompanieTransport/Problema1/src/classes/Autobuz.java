package classes;

public class Autobuz extends MijlocTransport{
    public Autobuz(int id, int numarStatii) {
        super(id, numarStatii);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mijlocul de transport cu id-ul " + getId() + " este un autobuz.");
    }
}
