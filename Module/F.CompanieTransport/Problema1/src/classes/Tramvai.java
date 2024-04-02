package classes;

public class Tramvai extends MijlocTransport{
    public Tramvai(int id, int numarStatii) {
        super(id, numarStatii);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mijlocul de transport cu id-ul " + getId() + " este un tramvai.");
    }
}
