package Main;

import classes.PersonalSpital;
import classes.fabrica.Fabrica;
import classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica fabrica=new Fabrica();
        try{
            PersonalSpital medic=fabrica.createPersonal(TipPersonal.MEDIC,"Popescu Maria",5000);
            PersonalSpital brancardier=fabrica.createPersonal(TipPersonal.BRANCARDIER,"Ionescu Ion",3000);
            PersonalSpital asistent= fabrica.createPersonal(TipPersonal.ASISTENT,"Ilie Radu",4000);
            PersonalSpital infirmier= fabrica.createPersonal(TipPersonal.INFIRMIER,"Popescu Mihai",2500);
            medic.afisareDetalii();
            brancardier.afisareDetalii();
            asistent.afisareDetalii();
            infirmier.afisareDetalii();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}