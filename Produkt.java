public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, int cena, int iloscNaMagazyne) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazyne;
    }
    public void wyswietlInformacje(){
        System.out.println("Nazwa " + nazwa + "\nCena " + cena);
        System.out.println("Ilość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        if(ilosc > 0) {
            iloscNaMagazynie += ilosc;
            System.out.println(ilosc + " do magazynu");
        } else {
            System.out.println("Podano złą ilość");
        }
    }

    public void usunZMagazynu(int ilosc) {
        if(ilosc > 0 && ilosc <= iloscNaMagazynie) {
            iloscNaMagazynie -= ilosc;
            System.out.println(ilosc + " ususnięto z magazynu.");
        } else {
            System.out.println("Nie można usunąć " + ilosc + " sztuk.");
        }
    }
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Elektrody", 758, 10);
        produkt.wyswietlInformacje();
        produkt.dodajDoMagazynu(5);
        produkt.usunZMagazynu(4);
        produkt.wyswietlInformacje();
        produkt.usunZMagazynu(2);
        produkt.wyswietlInformacje();

    }
}
