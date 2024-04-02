package classes;

public abstract class MedicamentFarmacie {
    private String denumire;
    private double pret;

    public MedicamentFarmacie(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MedicamentFarmacie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
    public abstract void afisareDetalii();
    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
