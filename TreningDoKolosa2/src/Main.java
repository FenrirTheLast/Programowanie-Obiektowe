
public class Main {
    public static void main(String[] args){
        // Tworzenie obiektu Produkt
        Produkt aparat = new Produkt("Aparat EEG", 28000.00, 1);
        Produkt telefon = new Produkt("Telefon", 1800.00, 3);
        Produkt elektrody = new Produkt("Elektrody", 7980.00, 300);


        // Wyświetlenie informacji o produkcie
        aparat.wyswietlInformacjie();

        // Dodawanie produktów do magazynu
        aparat.dodajDoMagazynu(2);

        // Próba dodanie ujemnej liczby
        aparat.dodajDoMagazynu(-4);

        // Usunięcie produktu z magazynu
        aparat.usunZMagazynu(2);

        // Próba usunięcia większej ilości z magazynu
        aparat.usunZMagazynu(5);

        // Próba usunięcia ujemnej ilości
        aparat.usunZMagazynu(-6);

        // Wyświetlanie informacji po operacjach
        aparat.wyswietlInformacjie();

        // Tworzenie Koszyka zakupowego
        KoszykZakupowy koszyk = new KoszykZakupowy();

        // Dodawanie produktów do koszyka
        koszyk.dodajProdukt(aparat, 1);
        koszyk.dodajProdukt(telefon, 1);

        // Próba dodania większej ilości niż jest na magazynie
        koszyk.dodajProdukt(elektrody, 40);
        koszyk.dodajProdukt(elektrody,10);


        //Wyswietlanie zawartości
        koszyk.wyswietlZawartoscKoszyka();

        // Oblicznie calkowitej wartości koszyka
        double calkowitaWartosc = koszyk.obliczCalkowitaWartosc();
        System.out.println("Całkowita wartość koszyka: " + calkowitaWartosc + " zł.");

        // Tworzenie zamówienia
        Zamowienie zamowienie = new Zamowienie(koszyk, "Nowe");

        // Wyświetlanie zamówienia
        zamowienie.wyswietlZamowienie();

        // Zmiana statusu zamówienia
        zamowienie.ustawStatusZamowienia("W realizacji");

        // Wyświetlanie zamówienia po zmianie statusu
        zamowienie.wyswietlZamowienie();

        // Zmiana statusu na "Zrealizowane"
        zamowienie.ustawStatusZamowienia("Zrealizowane");

        // Wyświetlanie finalnego zamówienia
        zamowienie.wyswietlZamowienie();

        // Tworzenie klienta
        Klient klient = new Klient("Jan", "Kowalski");

        // Dodawanie zamówień do klienta
        klient.dodajZamowienie(zamowienie);

        // Wyswietlanie historii zamowień
        klient.wyswietlHistorieZamowien();

        // Oblicznie lącznego kosztu zamówień

        double lacznyKoszt = klient.obliczLacznyKosztZamowien();
        System.out.println("\nŁączny koszt wszystkich zamówień: " + lacznyKoszt + " zł.");

        Sklep sklep = new Sklep();

        sklep.dodajProdukt(aparat);
        sklep.dodajProdukt(telefon);
        sklep.dodajProdukt(elektrody);

        sklep.wyswietlOferty();

        Klient klient2 = new Klient("Anna", "Rutkowska");

        // Zakupy klienta
        sklep.zakupy(klient2, "Aparat", 1);
        sklep.zakupy(klient2, "Telefon", 1);
        sklep.zakupy(klient2, "Elektrody", 10);
        sklep.zakupy(klient2, "Smartwatch", 3); // Próba zakupu produktu, który nie istnieje

        // Wyświetlenie historii zamówień klienta
        klient2.wyswietlHistorieZamowien();

        // Wyświetlenie oferty sklepu po zakupach
        sklep.wyswietlOferty();

        // Wyświetlenie zamówienia
        zamowienie.wyswietlZamowienie();

        // Płatność
        zamowienie.getPlatnosc().zaplac();

        // Próba finalizacji zamówienia
        zamowienie.finalizujZamowienie();

        // Zwrot produktu
        zamowienie.zwrocProdukt("Aparat", 1);

        // Wyświetlenie zamówienia po zwrocie
        zamowienie.wyswietlZamowienie();






    }
}