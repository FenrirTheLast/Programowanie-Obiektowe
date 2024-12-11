public class Klient extends Osoba implements IKlient {
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres) {
        super(imie, nazwisko);
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
    }

    @Override
    public Adres getAdres() {
        return adres;
    }

    @Override
    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
    }
}

