public class Adres {
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
            throw new IllegalArgumentException("Trzeba podac nazwę ulicy!!!");
        }
        this.ulica = ulica;
    }
    public String getNumerDomu() {
        return numerDomu;
    }
    public void setNumerDomu(String numerDomu) {
        if(numerDomu == null || numerDomu.trim().isEmpty()) {
            throw new IllegalArgumentException("Numer domu musi zostać podany!!!");
        }
        this.numerDomu = numerDomu;
    }
    public String getNumerMieszkania() {
        return numerMieszkania;
    }
    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }
    public String getMiasto() {
        return miasto;
    }
    public void setMiasto(String miasto) {
        if (miasto == null || miasto.trim().isEmpty()) {
            throw new IllegalArgumentException("Trzeba podac  nazwę miasta!!!");
        }
        this.miasto = miasto;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null || kodPocztowy.trim().isEmpty()) {
            throw new IllegalArgumentException("Kod pocztowy musi zostać podany!!!");
        }
        this.kodPocztowy = kodPocztowy;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Adres adres = (Adres) object;
        return ulica.equals(adres.ulica) && numerDomu.equals(adres.numerDomu) && ((numerMieszkania == null
                && adres.numerMieszkania == null)) || (numerMieszkania != null
                && numerMieszkania.equals(adres.numerMieszkania)) && miasto.equals(adres.miasto)
                && kodPocztowy.equals(adres.kodPocztowy);
    }
    @Override
    public String toString() {
        StringBuilder adres = new StringBuilder(kodPocztowy + " " + miasto + "\n" + ulica + " " + numerDomu);
        if (numerMieszkania != null) {
            adres.append("/").append(numerMieszkania);
        }
        return adres.toString();
    }
}
