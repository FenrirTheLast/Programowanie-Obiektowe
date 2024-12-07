public class Klient {
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
        if(imie == null || imie.trim().isEmpty()){
            throw new IllegalArgumentException("Brak imienia!!!");
        }
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.trim().isEmpty()){
            throw new IllegalArgumentException("Brak nazwiska!!!");
        }
        this.nazwisko = nazwisko;
    }
    public Adres getAdres() {
        return adres;
    }
    public void setAdres(Adres adres) {
        if(adres == null){
            throw new IllegalArgumentException("Brak adresu!!!");
        }
        this.adres = adres;
    }
    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        Klient klient = (Klient) object;
        return imie.equals(klient.imie) && nazwisko.equals(klient.nazwisko) && adres.equals(klient.adres);
    }
    @Override
    public String toString() {
        return "Klient: " + imie + ", " + nazwisko + ", " + adres;
    }
}
