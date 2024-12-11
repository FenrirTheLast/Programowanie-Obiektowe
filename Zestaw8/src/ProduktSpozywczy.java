public abstract class ProduktSpozywczy extends Owoc {
    private String dataWaznosci;

    public ProduktSpozywczy(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci) {
        super(nazwa, cena, iloscNaMagazynie); // Konstruktor klasy Owoc
        this.dataWaznosci = dataWaznosci;
    }

    public String getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(String dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }
}
