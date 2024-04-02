package main;

import classes.MijlocTransport;
import classes.fabrica.Fabrica;
import classes.fabrica.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        try{
            MijlocTransport autobuz = fabrica.createMijlocTransport(TipMijlocTransport.AUTOBUZ, 101, 21);
            autobuz.afisareDetalii();
            MijlocTransport tramvai = fabrica.createMijlocTransport(TipMijlocTransport.TRAMVAI, 102, 17);
            tramvai.afisareDetalii();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}