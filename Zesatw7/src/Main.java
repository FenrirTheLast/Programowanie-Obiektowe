public class Main {
    public static void main(String[] args) {
        Produkt elelktrody = new Produkt("Elektrody", 789.00, 10);
        Produkt czepek = new Produkt("Czepek EEG", 498.00, 1);

        System.out.println(elelktrody);
        System.out.println(czepek);

        Adres adres_1 = new Adres("Warszawska", "30", "Pracownia EEG", "Olsztyn", "11-041");
        Adres adres_2 = new Adres("Warszawska", "30", "Pracownia EMG", "Olsztyn", "11-041");

        Klient klient = new Klient("Damian", " Wilk", adres_1);
        Klient klient2 = new Klient("Marek", "Witkowski", adres_2);
        System.out.println(klient);
        System.out.println(klient2);

        Platnosc platnosc1 = new Platnosc(1250.00);
        Platnosc platnosc2 = new Platnosc(500.00);

        platnosc1.zaplac();
        System.out.println(platnosc1);
        System.out.println(platnosc2);

        System.out.println("Czy klienci są równi? " + platnosc1.equals(platnosc2));

    }
}