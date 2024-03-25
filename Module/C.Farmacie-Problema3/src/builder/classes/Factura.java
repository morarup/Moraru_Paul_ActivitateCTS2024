package builder.classes;

public class Factura {
    private int numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public Factura(int numarPungi, boolean plataCuCard, boolean cardFidelitate, float cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }

    void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }
}
