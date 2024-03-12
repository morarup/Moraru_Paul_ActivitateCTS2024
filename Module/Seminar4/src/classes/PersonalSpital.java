package classes;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisareDetalii();

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }
}
