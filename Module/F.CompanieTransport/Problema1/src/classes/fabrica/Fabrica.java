package classes.fabrica;

import classes.Autobuz;
import classes.MijlocTransport;
import classes.Tramvai;
import classes.Troleibuz;

public class Fabrica {
    public MijlocTransport createMijlocTransport(TipMijlocTransport tipMijlocTransport,int id, int numarStatii) throws Exception{
        switch (tipMijlocTransport){
            case AUTOBUZ:
                return new Autobuz(id, numarStatii);
            case TRAMVAI:
                return new Tramvai(id, numarStatii);
            case TROLEIBUZ:
                return new Troleibuz(id, numarStatii);
            default:throw new Exception("Tipul nu a fost gasit!");
        }
    }
}
