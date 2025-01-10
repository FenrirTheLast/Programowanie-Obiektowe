import javax.swing.*;

public class Produkt {
    // Pola Klasy
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;


    // Aby umożliwić dostęp do pól nazwa, cena i iloscNaMagazynie,
    // dodajemy odpowiednie gettery
    public String getNazwa(){
        return nazwa;
    }
    public double getCena(){
        return cena;
    }
    public int getIloscNaMagazynie(){
        return iloscNaMagazynie;
    }

    //Konstruktor
    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    //Metoda wyswieltInformacje
    public void wyswietlInformacjie(){
        System.out.println("Nazwa produktu: " + nazwa);
        System.out.println("Cena produktu: " + cena);
        System.out.println("Ilość na magazynie: " + iloscNaMagazynie);
    }

    //Metoda dadajDoMagazynu
    public void dodajDoMagazynu(int ilosc){
        if(ilosc > 0){
            iloscNaMagazynie += ilosc;
            System.out.println(ilosc + " szt. dodano do magazynu. Nowa ilość: " + iloscNaMagazynie);
        } else {
            System.out.println("Nie można dodać ujemnej lub zerowej ilosci!");
        }
    }

    //Metoda usunZMagazynu
    public void usunZMagazynu(int ilosc) {
        if(ilosc > 0 && ilosc <= iloscNaMagazynie){
            iloscNaMagazynie -= ilosc;
            System.out.println(ilosc + " szt. usunieto z magazynu. Pozostała ilość: " + iloscNaMagazynie);
        } else if(ilosc > iloscNaMagazynie){
            System.out.println("Brak wystarczającej ilości towaru w magazynie.");
        } else {
            System.out.println("Nie można usunąć ujemnej lub zerowej ilości");
        }
    }


}
