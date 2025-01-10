public class Platnosc {
    //Pola klasy
    private double kwota;
    private String statusPlatnosci; // Możliwe wartości: "Nieopłacone", "Opłacone"

    // Konstruktor
    public Platnosc(double kwota){
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }
    // Metoda zaplac
    public void zaplac() {
        if (statusPlatnosci.equals("Nieopłacone")){
            this.statusPlatnosci = "Opłacone";
            System.out.println("Płatność w wysokości " + kwota + " zł została opłacona.");
        } else {
            System.out.println("Płatność juz została zrealizowana.");
        }
    }

    // Gettery
    public double getKwota(){
        return kwota;
    }

    public String getStatusPlatnosci(){
        return statusPlatnosci;
    }
}
