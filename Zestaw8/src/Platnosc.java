public class Platnosc implements IPlatnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    @Override
    public double getKwota() {
        return kwota;
    }

    @Override
    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    @Override
    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    @Override
    public void zaplac() {
        if (!statusPlatnosci.equals("Opłacone")) {
            statusPlatnosci = "Opłacone";
            System.out.println("Płatność w wysokości " + kwota + " PLN została opłacona.");
        }
    }
}
