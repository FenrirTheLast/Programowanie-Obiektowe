public class Jablko extends ProduktSpozywczy {
    private String odmiana;

    public Jablko(String nazwa, double cena, int iloscNaMagazynie, String dataWaznosci, String odmiana) {
        super(nazwa, cena, iloscNaMagazynie, dataWaznosci);
        this.odmiana = odmiana;
    }

    public String getOdmiana() {
        return odmiana;
    }

    @Override
    public String smak() {
        return "Słodki";
    }

    @Override
    public void umyj() {
        System.out.println("Jabłko zostało umyte.");
    }

    @Override
    public void zjedz() {
        System.out.println("Zjedzono jabłko.");
    }
}
