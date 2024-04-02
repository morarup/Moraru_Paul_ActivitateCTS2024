package classes;

public class AutobuzLinie {
    private String modelAutobuz;
    private String soferAutobuz;
    private boolean opririCapatLinie;
    private boolean deschideUsile;
    private String textEcran;

    private AutobuzLinie(String modelAutobuz, String soferAutobuz, boolean opririCapatLinie, boolean deschideUsile, String textEcran) {
        this.modelAutobuz = modelAutobuz;
        this.soferAutobuz = soferAutobuz;
        this.opririCapatLinie = opririCapatLinie;
        this.deschideUsile = deschideUsile;
        this.textEcran = textEcran;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", soferAutobuz='").append(soferAutobuz).append('\'');
        sb.append(", opririCapatLinie=").append(opririCapatLinie);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    private void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    private void setOpririCapatLinie(boolean opririCapatLinie) {
        this.opririCapatLinie = opririCapatLinie;
    }

    private void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    private void setTextEcran(String textEcran) {
        this.textEcran = textEcran;
    }
    public static class AutobuzLinieBuilder implements Builder {
        private String modelAutobuz;
        private String soferAutobuz;
        private boolean opririCapatLinie;
        private boolean deschideUsile;
        private String textEcran;

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(modelAutobuz,soferAutobuz,opririCapatLinie,deschideUsile,textEcran);
        }

        public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
            this.modelAutobuz = modelAutobuz;
            return this;
        }

        public AutobuzLinieBuilder setSoferAutobuz(String soferAutobuz) {
            this.soferAutobuz = soferAutobuz;
            return this;
        }

        public AutobuzLinieBuilder setOpririCapatLinie(boolean opririCapatLinie) {
            this.opririCapatLinie = opririCapatLinie;
            return this;
        }

        public AutobuzLinieBuilder setDeschideUsile(boolean deschideUsile) {
            this.deschideUsile = deschideUsile;
            return this;
        }

        public AutobuzLinieBuilder setTextEcran(String textEcran) {
            this.textEcran = textEcran;
            return this;
        }
    }
}
