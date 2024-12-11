public class Koszula extends ProduktPrzemyslowy {
    private String rozmiar;
    private Ubranie funkcje;

    public Koszula(String nazwa, double cena, int iloscNaMagazynie, String krajProdukcji, String rozmiar) {
        super(nazwa, cena, iloscNaMagazynie, krajProdukcji);
        this.rozmiar = rozmiar;
        this.funkcje = new UbranieImpl();
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void wypierz() {
        funkcje.wypierz();
    }

    public void zaloz() {
        funkcje.zaloz();
    }

    public void wyprasuj() {
        funkcje.wyprasuj();
    }

    public void wysusz() {
        funkcje.wysusz();
    }

    public void zniszcz() {
        funkcje.zniszcz();
    }

    private class UbranieImpl extends Ubranie {
        @Override
        public void wypierz() {
            System.out.println("Koszula została wyprana.");
        }

        @Override
        public void zaloz() {
            System.out.println("Koszula została założona.");
        }

        @Override
        public void wyprasuj() {
            System.out.println("Koszula została wyprasowana.");
        }

        @Override
        public void wysusz() {
            System.out.println("Koszula została wysuszona.");
        }

        @Override
        public void zniszcz() {
            System.out.println("Koszula została zniszczona.");
        }
    }
}


