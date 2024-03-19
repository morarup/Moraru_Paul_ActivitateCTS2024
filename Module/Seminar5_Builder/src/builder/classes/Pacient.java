package builder.classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append('}');
        return sb.toString();
    }

    void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }
}
