package main;

import classes.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie.AutobuzLinieBuilder autobuzLinieBuilder = new AutobuzLinie.AutobuzLinieBuilder();
        AutobuzLinie autobuzLinie1 = autobuzLinieBuilder
                .setModelAutobuz("Mercedes")
                .setSoferAutobuz("Mihai")
                .setOpririCapatLinie(true)
                .setDeschideUsile(false)
                .setTextEcran("RutaAutobuz1")
                .build();
        System.out.println(autobuzLinie1.toString());
    }
}