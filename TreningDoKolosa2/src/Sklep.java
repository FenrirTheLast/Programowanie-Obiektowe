import java.util.ArrayList;
public class Sklep {
    // Pole klasy  - lista dostępnych produktów
    private ArrayList<Produkt> produkty;

    // Konstruktor
    public Sklep(){
        produkty = new ArrayList<>();
    }

    // Metoda dodajProdukt
    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
        System.out.println("Dodano produkt do oferty sklepu: " + produkt.getNazwa());
    }

    // Metoda wyswietlOferty
    public void wyswietlOferty(){
        System.out.println("Produkty dostępne w sklepie:");
        if(produkty.isEmpty()){
            System.out.println("Brak produktów w ofercie sklepu.");
        } else {
            for (Produkt produkt: produkty) {
                System.out.println("- " + produkt.getNazwa() + " (Cena: " + produkt.getCena() + " zł, ilość w magazynie: " + produkt.getIloscNaMagazynie() + ")");
            }
        }
    }
    // Metoda wyszukajProduktu
    public Produkt wyszukajProduktu(String nazwa){
        for(Produkt produkt: produkty){
            if(produkt.getNazwa().equalsIgnoreCase(nazwa)){
                return produkt;
            }
        }
        System.out.println("Produkt o nazwie '" + nazwa + "' nie został znmaleziony.");
        return null;
    }

    // Metoda zakupy
    public void zakupy(Klient klient, String nazwaProduktu, int ilosc){
        Produkt produkt = wyszukajProduktu(nazwaProduktu);
        if(produkt != null){
            if(produkt.getIloscNaMagazynie() >= ilosc){

                // Tworzenie koszyka i dodanie produktu
                KoszykZakupowy koszyk = new KoszykZakupowy();
                koszyk.dodajProdukt(produkt, ilosc);

                // Tworzenie zamówień i przypisanie do klienta
                Zamowienie zamowienie = new Zamowienie(koszyk, "Nowe");
                klient.dodajZamowienie(zamowienie);

                System.out.println("Zakupy zakończone pomyślnie. Produkt '" + nazwaProduktu + "' został dodany do koszyka klienta.");
            } else {
                System.out.println("Brak wystarczającej ilości produktu '" + nazwaProduktu + "' w magazynie.");
            }
        }
    }
}
