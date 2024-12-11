public interface IKlient {
    Adres getAdres();
    void setAdres(Adres adres);

    default void wyswietlInformacje() {
        System.out.println("Informacje o kliencie: " + getAdres());
    }
}

