package builder.classes;

public class PacientBuilder implements Builder{

    Pacient pacient;

    public PacientBuilder(){
        pacient = new Pacient(false,false,false,false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun) {
        this.pacient.setMicDejun(micDejun);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    public Pacient build(){
        return pacient;
    }
}
