import java.util.HashMap;

public class KoszykZakupowy {

    // Lista przechowująca produkty i ich ilość w koszyku
    private HashMap<Produkt, Integer> koszyk;

    // Konstruktor
    public KoszykZakupowy(){
        koszyk = new HashMap<>();
    }

    // Metoda dodajProdukt
    public void dodajProdukt(Produkt produkt, int ilosc){
        if( ilosc > 0 && produkt.getIloscNaMagazynie() >= ilosc){
            // Dodanie produktu do koszyka
            koszyk.put(produkt, koszyk.getOrDefault(produkt, 0) + ilosc);
            // Zmniejszenie ilosci na magazynie
            produkt.usunZMagazynu(ilosc);
            System.out.println("Dodano " + ilosc + " szt. produktu " + produkt.getNazwa() + " do koszyka.");
        } else {
            System.out.println("Brak wystarczającej ilości produktu " + produkt.getNazwa() + " na magazynie,");
        }
    }

    // Getter dla koszyka
    public HashMap<Produkt, Integer> getKoszyk() {
        return koszyk;
    }

    // Metoda wyswietlZawartoscKoszyka
    public void wyswietlZawartoscKoszyka(){
        System.out.println("Zawartość Koszyka: ");
        if(koszyk.isEmpty()){
            System.out.println("Koszyk jest pusty.");
        } else {
            for (HashMap.Entry<Produkt, Integer> entry : koszyk.entrySet()){
                Produkt produkt = entry.getKey();
                int ilosc = entry.getValue();
                System.out.println("- " + produkt.getNazwa() + ": " + ilosc + " szt. (Cena: " + produkt.getCena() + " zł/szt.)");

            }
        }
    }

    // Metoda obliczCalkowitaWartosc
    public double obliczCalkowitaWartosc(){
        double suma = 0.0;
        for (HashMap.Entry<Produkt, Integer> entry : koszyk.entrySet()){
            suma += entry.getKey().getCena() * entry.getValue();

        }
        return suma;
    }
}
