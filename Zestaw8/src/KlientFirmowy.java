public class KlientFirmowy extends Klient {
    private final String NIP;
    private final String REGON;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, String NIP, String REGON) {
        super(imie, nazwisko, adres);
        if (NIP == null || NIP.trim().isEmpty()) {
            throw new IllegalArgumentException("NIP nie może być pusty.");
        }
        if (REGON == null || REGON.trim().isEmpty()) {
            throw new IllegalArgumentException("REGON nie może być pusty.");
        }
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public String getNIP() {
        return NIP;
    }

    public String getREGON() {
        return REGON;
    }
}

