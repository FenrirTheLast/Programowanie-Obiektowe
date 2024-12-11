public class KlientIndywidualny extends Klient {
    private final String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String PESEL) {
        super(imie, nazwisko, adres);
        if (PESEL == null || PESEL.trim().isEmpty() || PESEL.length() != 11) {
            throw new IllegalArgumentException("PESEL musi być liczbą o długości 11 znaków.");
        }
        this.PESEL = PESEL;
    }

    public String getPESEL() {
        return PESEL;
    }
}