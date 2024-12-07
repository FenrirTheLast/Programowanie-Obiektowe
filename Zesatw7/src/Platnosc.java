public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        setKwota(kwota);
        this.statusPlatnosci = "Nieopłacone";
    }
    public double getKwota() {
        return kwota;
    }
    public void setKwota(double kwota) {
        if(kwota <= 0){
            throw new IllegalArgumentException("Kwota musi byc większa od zera!!!");
        }
        this.kwota = kwota;
    }
    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
    public void zaplac(){
        if(statusPlatnosci.equals("Nieopłacone")){
            statusPlatnosci = "Opłacone";
        }
    }
    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Platnosc platnosc = (Platnosc) object;
        return Double.compare(platnosc.kwota, kwota) == 0 && statusPlatnosci.equals(platnosc.statusPlatnosci);
    }
    @Override
    public String toString(){
        return "Płatność " + kwota + " złotych, Status: " + statusPlatnosci;
    }
}
