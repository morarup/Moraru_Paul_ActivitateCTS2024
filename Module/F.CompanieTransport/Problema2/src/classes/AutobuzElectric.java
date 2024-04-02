package classes;

public class AutobuzElectric {
    private String denumire;
    private String ruta;

    public AutobuzElectric(String denumire, String ruta) {
        this.denumire = denumire;
        this.ruta = ruta;
    }

    public AutobuzElectric() {
        this.denumire="Necunoscut";
        this.ruta="Necunoscut";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutobuzElectric{");
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

    public AutobuzElectric clone(){
        AutobuzElectric autobuzElectric = new AutobuzElectric();
        autobuzElectric.setDenumire(this.denumire);
        autobuzElectric.setRuta(this.ruta);
        return autobuzElectric;
    }
}
