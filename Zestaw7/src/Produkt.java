
public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        setNazwa(nazwa);
        setCena(cena);
        setIloscNaMagazynie(iloscNaMagazynie);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa produktu nie może być pusta.");
        }
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena musi być większa od zera.");
        }
        this.cena = cena;
    }

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produkt produkt = (Produkt) obj;
        return Double.compare(produkt.cena, cena) == 0 &&
                nazwa.equals(produkt.nazwa);
    }

    @Override
    public String toString() {
        return "Produkt: " + nazwa + ", Cena: " + cena + " PLN, Ilość na magazynie: " + iloscNaMagazynie;
    }
}


class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        setKwota(kwota);
        this.statusPlatnosci = "Nieopłacone";
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if (kwota <= 0) {
            throw new IllegalArgumentException("Kwota musi być większa od zera.");
        }
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void zaplac() {
        if (statusPlatnosci.equals("Nieopłacone")) {
            statusPlatnosci = "Opłacone";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Platnosc platnosc = (Platnosc) obj;
        return Double.compare(platnosc.kwota, kwota) == 0 &&
                statusPlatnosci.equals(platnosc.statusPlatnosci);
    }

    @Override
    public String toString() {
        return "Płatność: " + kwota + " PLN, Status: " + statusPlatnosci;
    }
}


class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setNumerMieszkania(numerMieszkania);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica == null || ulica.trim().isEmpty()) {
            throw new IllegalArgumentException("Ulica nie może być pusta.");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (numerDomu == null || numerDomu.trim().isEmpty()) {
            throw new IllegalArgumentException("Numer domu nie może być pusty.");
        }
        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania; // Pole opcjonalne
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.trim().isEmpty()) {
            throw new IllegalArgumentException("Miasto nie może być puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.trim().isEmpty()) {
            throw new IllegalArgumentException("Kod pocztowy nie może być puste.");
        }
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Adres adres = (Adres) obj;
        return ulica.equals(adres.ulica) &&
                numerDomu.equals(adres.numerDomu) &&
                ((numerMieszkania == null && adres.numerMieszkania == null) ||
                        (numerMieszkania != null && numerMieszkania.equals(adres.numerMieszkania))) &&
                miasto.equals(adres.miasto) &&
                kodPocztowy.equals(adres.kodPocztowy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(kodPocztowy + " " + miasto + "\n" + ulica + " " + numerDomu);
        if (numerMieszkania != null) {
            sb.append("/").append(numerMieszkania);
        }
        return sb.toString();
    }
}


class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres) {
        setImie(imie);
        setNazwisko(nazwisko);
        setAdres(adres);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.trim().isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwisko nie może być puste.");
        }
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Klient klient = (Klient) obj;
        return imie.equals(klient.imie) &&
                nazwisko.equals(klient.nazwisko) &&
                adres.equals(klient.adres);
    }

    @Override
    public String toString() {
        return "Klient: " + imie + " " + nazwisko + "\nAdres:\n" + adres.toString();
    }
}
class Main {
    public static void main(String[] args) {

        Produkt laptop = new Produkt("Laptop", 3000.00, 10);
        Produkt myszka = new Produkt("Myszka", 50.00, 20);

        System.out.println(laptop);
        System.out.println(myszka);

        Adres adres1 = new Adres("Warszawska", "15", "10", "Kraków", "30-001");
        Adres adres2 = new Adres("Poznańska", "20", null, "Warszawa", "00-123");

        Klient klient1 = new Klient("Jan", "Kowalski", adres1);
        Klient klient2 = new Klient("Anna", "Nowak", adres2);

        System.out.println(klient1);
        System.out.println(klient2);

        Platnosc platnosc1 = new Platnosc(3050.00);
        Platnosc platnosc2 = new Platnosc(500.00);

        platnosc1.zaplac();
        System.out.println(platnosc1);
        System.out.println(platnosc2);

        System.out.println("Czy klienci są równi? " + klient1.equals(klient2));
    }
}





