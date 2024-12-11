public interface IProdukt {
    String getNazwa();
    double getCena();
    int iloscNaMagazynie();
    boolean usunZMagazynu(int ilosc);
    void wyswietlInformacje();

    default boolean czyDostepny() {
        return iloscNaMagazynie() > 0;
    }
}
