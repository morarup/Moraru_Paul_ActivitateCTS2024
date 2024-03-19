package clase;

public class RetetaCrema implements RetetaAbstracta{
    private int cantiate;
    private String nume;

    public RetetaCrema(int cantiate, String nume) {
        this.cantiate = cantiate;
        this.nume = nume;
    }

    public int getCantiate() {
        return cantiate;
    }

    public void setCantiate(int cantiate) {
        this.cantiate = cantiate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public RetetaCrema(){
        this.nume="RetetaNecunoscuta";
        this.cantiate=0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RetetaCrema{");
        sb.append("cantiate=").append(cantiate);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public RetetaAbstracta clone(){
        RetetaCrema retetaCrema = new RetetaCrema();
        retetaCrema.setCantiate(this.cantiate);
        retetaCrema.setNume(this.nume);
        return retetaCrema;
    }
}
