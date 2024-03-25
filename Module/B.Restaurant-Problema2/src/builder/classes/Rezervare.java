package builder.classes;

public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }

    void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
    }

    void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
