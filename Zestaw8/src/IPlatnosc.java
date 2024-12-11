public interface IPlatnosc {
    double getKwota();
    void setKwota(double kwota);
    String getStatusPlatnosci();
    void zaplac();

    default void wyswietlStatusPlatnosci() {
        System.out.println("Status płatności: " + getStatusPlatnosci() + ", Kwota: " + getKwota());
    }
}
