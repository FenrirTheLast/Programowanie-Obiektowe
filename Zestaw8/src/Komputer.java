public class Komputer extends ProduktPrzemyslowy {
    private String model;
    private UrzadzenieElektroniczne funkcje;

    public Komputer(String nazwa, double cena, int iloscNaMagazynie, String krajProdukcji, String model) {
        super(nazwa, cena, iloscNaMagazynie, krajProdukcji);
        this.model = model;
        this.funkcje = new UrzadzenieElektroniczneImpl();
    }

    public String getModel() {
        return model;
    }

    public void napraw() {
        funkcje.napraw();
    }

    public void uzyj() {
        funkcje.uzyj();
    }

    public void zepsuj() {
        funkcje.zepsuj();
    }

    public void wlacz() {
        funkcje.wlacz();
    }

    public void wylacz() {
        funkcje.wylacz();
    }

    private class UrzadzenieElektroniczneImpl extends UrzadzenieElektroniczne {
        @Override
        public void napraw() {
            System.out.println("Komputer został naprawiony.");
        }

        @Override
        public void uzyj() {
            System.out.println("Komputer jest używany.");
        }

        @Override
        public void zepsuj() {
            System.out.println("Komputer został zepsuty.");
        }

        @Override
        public void wlacz() {
            System.out.println("Komputer został włączony.");
        }

        @Override
        public void wylacz() {
            System.out.println("Komputer został wyłączony.");
        }
    }
}