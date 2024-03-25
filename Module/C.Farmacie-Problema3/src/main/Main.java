package main;

import builder.classes.Factura;
import builder.classes.FacturaBuilder;

public class Main {
    public static void main(String[] args) {
        Factura factura = new FacturaBuilder()
                .setNumarPungi(2)
                .setPlataCuCard(true)
                .setCardFideliate(false)
                .setCotaTVA(0.19F)
                .build();
        System.out.println(factura);

        Factura factura2 = new FacturaBuilder().build();
        System.out.println(factura2);
    }
}