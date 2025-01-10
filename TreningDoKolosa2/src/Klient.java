import java.util.ArrayList;
public class Klient {
    // Pola Klasy
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;

    // Konstruktor
    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    // Metoda dodajZamowienie
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
        System.out.println("Dodano nowe zamówienie dla klienta: " + imie + " " + nazwisko);
    }

    // Metoda wyświetlHistorieZamowien
    public void wyswietlHistorieZamowien(){
        System.out.println("Historia zamówień dla klienta: " + imie + " " + nazwisko);
        if(listaZamowien.isEmpty()){
            System.out.println("Brak zamówień.");
        } else {
            for (int i = 0; i < listaZamowien.size(); i++) {
                System.out.println("\nZamówienie #" + (i + 1) + ":");
                listaZamowien.get(i).wyswietlZamowienie();
            }
        }
    }

    // Metoda obliczLacznyKosztZamowien
    public double obliczLacznyKosztZamowien() {
        double suma = 0.0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return suma;
    }

}
