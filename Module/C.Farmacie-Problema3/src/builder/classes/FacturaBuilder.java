package builder.classes;

public class FacturaBuilder {
    Factura factura;
    public Factura build(){
        return factura;
    }

    public FacturaBuilder() {
        factura = new Factura(0,false,false,0);
    }

    public FacturaBuilder setNumarPungi(int numarPungi){
        this.factura.setNumarPungi(numarPungi);
        return this;
    }
    public FacturaBuilder setPlataCuCard(boolean plataCuCard){
        this.factura.setPlataCuCard(plataCuCard);
        return this;
    }
    public FacturaBuilder setCardFideliate(boolean cardFideliate){
        this.factura.setCardFidelitate(cardFideliate);
        return this;
    }
    public FacturaBuilder setCotaTVA(float cotaTVA){
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }
}
