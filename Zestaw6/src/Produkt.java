import java.util.ArrayList;

public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int iloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public boolean usunZMagazynu(int ilosc) {
        if (ilosc > 0 && ilosc <= iloscNaMagazynie) {
            iloscNaMagazynie -= ilosc;
            return true;
        } else if (ilosc < 0) {
            iloscNaMagazynie -= ilosc;
            return true;
        }
        return false;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa produktu: " + nazwa + ", Cena: " + cena + " PLN, Ilość na magazynie: " + iloscNaMagazynie);
    }
}

class KoszykZakupowy {
    protected ArrayList<Produkt> produktyWKoszyku;
    protected ArrayList<Integer> ilosci;

    public KoszykZakupowy() {
        produktyWKoszyku = new ArrayList<>();
        ilosci = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        for (int i = 0; i < produktyWKoszyku.size(); i++) {
            if (produktyWKoszyku.get(i).getNazwa().equalsIgnoreCase(produkt.getNazwa())) {
                ilosci.set(i, ilosci.get(i) + ilosc);
                produkt.usunZMagazynu(ilosc);
                System.out.println(ilosc + " sztuk " + produkt.getNazwa() + " dodano do koszyka.");
                return;
            }
        }

        produktyWKoszyku.add(produkt);
        ilosci.add(ilosc);
        produkt.usunZMagazynu(ilosc);
        System.out.println(ilosc + " sztuk " + produkt.getNazwa() + " dodano do koszyka.");
    }

    public void wyswietlZawartoscKoszyka() {
        System.out.println("Zawartość koszyka:");
        for (int i = 0; i < produktyWKoszyku.size(); i++) {
            Produkt produkt = produktyWKoszyku.get(i);
            System.out.println("Produkt: " + produkt.getNazwa() + ", Ilość: " + ilosci.get(i) + ", Cena jednostkowa: " + produkt.getCena() + " PLN");
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for (int i = 0; i < produktyWKoszyku.size(); i++) {
            suma += produktyWKoszyku.get(i).getCena() * ilosci.get(i);
        }
        return suma;
    }
}


class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac() {
        if (!statusPlatnosci.equals("Opłacone")) {
            statusPlatnosci = "Opłacone";
            System.out.println("Płatność w wysokości " + kwota + " PLN została opłacona.");
        } else {
            System.out.println("Płatność już została zrealizowana.");
        }
    }

    public boolean czyOplacone() {
        return statusPlatnosci.equals("Opłacone");
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}


class Zamowienie {
    protected KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
        System.out.println("Status zamówienia zmieniono na: " + statusZamowienia);
    }

    public void wyswietlZamowienie() {
        System.out.println("Zamówienie:");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
        System.out.println("Kwota płatności: " + platnosc.getKwota() + " PLN");
    }

    public void finalizujZamowienie() {
        if (platnosc.czyOplacone()) {
            ustawStatusZamowienia("Gotowe do wysyłki");
        } else {
            System.out.println("Nie można sfinalizować zamówienia. Płatność nie została zrealizowana.");
        }
    }

    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
        for (int i = 0; i < koszykZakupowy.produktyWKoszyku.size(); i++) {
            Produkt produkt = koszykZakupowy.produktyWKoszyku.get(i);
            if (produkt.getNazwa().equalsIgnoreCase(nazwaProduktu)) {
                int aktualnaIlosc = koszykZakupowy.ilosci.get(i);
                if (ilosc > 0 && ilosc <= aktualnaIlosc) {
                    koszykZakupowy.ilosci.set(i, aktualnaIlosc - ilosc);
                    produkt.usunZMagazynu(-ilosc); // Przywrócenie ilości do magazynu
                    double zmianaKwoty = produkt.getCena() * ilosc;
                    platnosc.setKwota(platnosc.getKwota() - zmianaKwoty);
                    System.out.println("Zwrócono " + ilosc + " sztuk produktu " + nazwaProduktu + " do magazynu.");
                    return;
                }
            }
        }
        System.out.println("Nie znaleziono produktu w koszyku lub podano nieprawidłową ilość.");
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }
}

 class Main {
    public static void main(String[] args) {
        Produkt laptop = new Produkt("Laptop", 3000.00, 10);
        Produkt myszka = new Produkt("Myszka", 50.00, 20);

        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(laptop, 2);
        koszyk.dodajProdukt(myszka, 5);

        Zamowienie zamowienie = new Zamowienie(koszyk, "Oczekujące");
        zamowienie.wyswietlZamowienie();

        Platnosc platnosc = zamowienie.getPlatnosc();
        platnosc.zaplac();

        zamowienie.finalizujZamowienie();
        zamowienie.wyswietlZamowienie();

        zamowienie.zwrocProdukt("Myszka", 2);
        zamowienie.wyswietlZamowienie();
    }
}


