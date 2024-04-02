package adapter.softVechi;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;

public class AdapterBarBucatarie extends Bar implements SoftBucatarie{


    @Override
    public void printareBon() {
        super.printareNotaDePlata();
    }

    @Override
    public void adaugareProduse(Produs produs) {
        Bautura b = new Bautura(produs.getPret(), produs.getDenumire(), 0);
        super.adaugaBautura(b);
    }
}
