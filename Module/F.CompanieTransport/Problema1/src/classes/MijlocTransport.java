package classes;

public abstract class MijlocTransport {
    private int id;
    private int numarStatii;

    public MijlocTransport(int id, int numarStatii) {
        this.id = id;
        this.numarStatii = numarStatii;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MijlocTransport{");
        sb.append("id=").append(id);
        sb.append(", numarStatii=").append(numarStatii);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public int getNumarStatii() {
        return numarStatii;
    }
    public abstract void afisareDetalii();
}
