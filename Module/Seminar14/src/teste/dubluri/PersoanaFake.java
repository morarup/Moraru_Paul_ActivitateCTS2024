package teste.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valoareGetSex;
    private int valoareGetVarsta;
    private  boolean valoareGetCheckCNP;


    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareGetCheckCNP;
    }
    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetCheckCNP(boolean valoareGetCheckCNP) {
        this.valoareGetCheckCNP = valoareGetCheckCNP;
    }
}
