public class Produkt implements IProdukt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        if (nazwa == null || nazwa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie może być pusta.");
        }
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena musi być większa od zera.");
        }
        if (iloscNaMagazynie < 0) {
            throw new IllegalArgumentException("Ilość na magazynie nie może być ujemna.");
        }
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa nie może być pusta.");
        }
        this.nazwa = nazwa;
    }

    @Override
    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena musi być większa od zera.");
        }
        this.cena = cena;
    }

    @Override
    public int iloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if (iloscNaMagazynie < 0) {
            throw new IllegalArgumentException("Ilość na magazynie nie może być ujemna.");
        }
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    @Override
    public boolean usunZMagazynu(int ilosc) {
        if (ilosc <= 0 || ilosc > iloscNaMagazynie) {
            throw new IllegalArgumentException("Nieprawidłowa ilość do usunięcia z magazynu.");
        }
        iloscNaMagazynie -= ilosc;
        return true;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa produktu: " + nazwa + ", Cena: " + cena + " PLN, Ilość na magazynie: " + iloscNaMagazynie);
    }
}
