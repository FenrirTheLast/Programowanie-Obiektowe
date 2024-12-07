public class Produkt {
        private String nazwa;
        private double cena;
        private int iloscNaMagazynie;
        public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
            setNazwa(nazwa);
            setCena(cena);
            setIloscNaMagazynie(iloscNaMagazynie);
        }
        public String getNazwa() {
            return nazwa;
        }
        public void setNazwa(String nazwa) {
            if (nazwa == null || nazwa.trim().isEmpty()) {
                throw new IllegalArgumentException("Nazwa produktu nie może być pusta");
            }
            this.nazwa = nazwa;
        }
        public double getCena(double cena) {
            return cena;
        }
        public void setCena(double cena) {
            if (cena <= 0) {
                throw new IllegalArgumentException("Cena musi być wieksza od zera!!!");
            }
            this.cena = cena;
        }
        public int IloscNaMagazynie() {
            return iloscNaMagazynie;
        }
        public void setIloscNaMagazynie(int iloscNaMagazynie) {
            if (iloscNaMagazynie < 0) {
                throw new IllegalArgumentException("Ilość na magazynie nie może być ujemna.");
            }
            this.iloscNaMagazynie = iloscNaMagazynie;
        }
        @Override
    public String toString() {
            return "Produkt: " + nazwa + ", " + cena + ", " + iloscNaMagazynie + "\n";
        }

}
