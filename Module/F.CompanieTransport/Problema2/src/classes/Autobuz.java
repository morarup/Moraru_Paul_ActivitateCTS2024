package classes;

public class Autobuz implements AutobuzAbstract {
    private String denumire;
    private String ruta;

    public Autobuz() {
        this.denumire = denumire;
        this.ruta = ruta;
    }

    public Autobuz(String denumire, String ruta) {
        this.denumire = denumire;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autobuz{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", ruta='").append(ruta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    @Override
    public AutobuzAbstract clone(){
        Autobuz abstracta = new Autobuz();
        abstracta.setDenumire(this.denumire);
        abstracta.setRuta(this.ruta);
        return abstracta;
    }
}
