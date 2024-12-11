public class ProduktPrzemyslowy extends Produkt {
    private String krajProdukcji;

    public ProduktPrzemyslowy(String nazwa, double cena, int iloscNaMagazynie, String krajProdukcji) {
        super(nazwa, cena, iloscNaMagazynie);
        this.krajProdukcji = krajProdukcji;
    }

    public String getKrajProdukcji() {
        return krajProdukcji;
    }

    public void setKrajProdukcji(String krajProdukcji) {
        this.krajProdukcji = krajProdukcji;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Kraj produkcji: " + krajProdukcji);
    }
}
