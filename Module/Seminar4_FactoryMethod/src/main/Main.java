package main;

import classes.Medic;
import classes.PersonalSpital;
import classes.factory.*;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu){
        PersonalSpital personal = fabrica.createPersonal(nume, salariu);
        personal.afisareDetalii();
    }

    public static void main(String[] args) {

        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();

        PersonalSpital medic = fabricaMedic.createPersonal("Popescu Maria", 5000);
        PersonalSpital asistent = fabricaAsistent.createPersonal("Ionescu Ion", 4000);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("Ilie Radu", 3500);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(),"Pop Mihai",7000);
        prelucrarePersonal(new FabricaInfirmier(), "Popa Alexandru", 7500);
    }
}