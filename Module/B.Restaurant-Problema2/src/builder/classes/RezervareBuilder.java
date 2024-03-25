package builder.classes;

public class RezervareBuilder implements Builder{
    Rezervare rezervare;
    public Rezervare build(){
        return rezervare;
    }
    public RezervareBuilder(){
        rezervare = new Rezervare(false,false,false,false,"false");
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam){
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }
    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice){
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }
    public RezervareBuilder setDecorMasa(boolean decorMasa){
        this.rezervare.setDecorMasa(decorMasa);
        return this;
    }
    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata){
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

}
