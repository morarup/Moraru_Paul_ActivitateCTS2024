package classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta = null;
    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConexiuneBazaDeDate{");
        sb.append("numeBaza='").append(numeBaza).append('\'');
        sb.append(", nrTabele=").append(nrTabele);
        sb.append(", linkConexiune='").append(linkConexiune).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public static ConexiuneBazaDeDate getInstanta() {
        return instanta;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static void setInstanta(ConexiuneBazaDeDate instanta) {
        ConexiuneBazaDeDate.instanta = instanta;
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        if(instanta == null) {
            instanta = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instanta;
    }


}

