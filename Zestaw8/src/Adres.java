public class Adres implements IAdres {
    private String ulica;
    private String numerDomu;
    private String miasto;

    public Adres(String ulica, String numerDomu, String miasto) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
    }

    @Override
    public String getUlica() {
        return ulica;
    }

    @Override
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Override
    public String getNumerDomu() {
        return numerDomu;
    }

    @Override
    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    @Override
    public String getMiasto() {
        return miasto;
    }

    @Override
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
