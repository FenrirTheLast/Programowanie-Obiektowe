import java.util.HashMap;

public class Zamowienie {
    // Pola klasy
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia; // Możliwie statusy: "Nowe", "W realizacji", "Zrealizowane"
    private Platnosc platnosc;

    // Konstruktor
    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia){
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    //Getter dla koszykZakupowy
    public KoszykZakupowy getKoszykZakupowy(){
        return koszykZakupowy;
    }

    // Getter dla statusZamowienia
    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    // Getter dla płatności
    public Platnosc getPlatnosc(){
        return platnosc;
    }

    // Metoda ustawSatusZamowienia
    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
        System.out.println("Status zamówienia zmieniony na: " + nowyStatus);
    }

    // Metoda wyswietlZamowienie
    public void wyswietlZamowienie(){
        System.out.println("Zamówienie: ");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Całkowita wartość zamówienia: " + koszykZakupowy.obliczCalkowitaWartosc() + " zł.");
    }

    // Metoda finalizujZamówienie
    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacone")){
            this.statusZamowienia = "Gotowe do wysyłki";
            System.out.println("Zamówienie zostało sfinalizowane i jest gotowe do wysyłki.");
        } else {
            System.out.println("Nie można sfinalizować zamówienia. Płatność nie została opłacona");
        }
    }

    // Metoda zwrocProdukt
    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
        for (HashMap.Entry<Produkt, Integer> entry : koszykZakupowy.getKoszyk().entrySet()) {
            Produkt produkt = entry.getKey();
            int iloscWKoszyku = entry.getValue();

            if (produkt.getNazwa().equalsIgnoreCase(nazwaProduktu)) {
                if (ilosc <= iloscWKoszyku) {
                    produkt.dodajDoMagazynu(ilosc);
                    koszykZakupowy.getKoszyk().put(produkt, iloscWKoszyku - ilosc);

                    // Aktualizujemy kwotę zamówienia
                    double zwroconaKwota = ilosc * produkt.getCena();
                    platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
                    System.out.println("Zwrócono " + ilosc + " szt. produktu '" + nazwaProduktu + "' do magazynu. Kwota zwrotu: " + zwroconaKwota + " zł.");
                    return;
                } else {
                    System.out.println("Nie można zwrócić więcej sztuk produktu niż znajduje się w koszyku.");
                    return;
                }
            }
        }
        System.out.println("Produkt '" + nazwaProduktu + "' nie został znaleziony w koszyku.");
    }
}
