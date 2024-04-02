package main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.*;

public class Main {

    public static void platesteConsumatie(SoftBucatarie comanda){
        comanda.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs1 = new Produs("Pizza", 52);
        Produs produs2 = new Produs("Paste", 45);
        bucatarie.adaugareProduse(produs1);
        bucatarie.adaugareProduse(produs2);

        platesteConsumatie(bucatarie);

        AdapterBarBucatarie bar = new AdapterBarBucatarie();
        bar.adaugaBautura(new Bautura(20,"Cola",0));
        bar.adaugaBautura(new Bautura(15,"Pepsi",0));
        bar.adaugaBautura(new Bautura(18,"Sprite",0));

        Bautura bautura = new Bautura(5,"Apa",0);
        AdapterBauturaProdus produs = new AdapterBauturaProdus(bautura);
        bar.adaugareProduse(produs);

        platesteConsumatie(bar);
    }
}