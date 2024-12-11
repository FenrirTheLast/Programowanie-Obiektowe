public class Main {
    public static void main(String[] args) {
        Jablko jablko = new Jablko("Jabłko", 3.50, 100, "2024-12-31", "Ligol");
        jablko.wyswietlInformacje();
        System.out.println("Odmiana: " + jablko.getOdmiana());
        jablko.umyj();
        jablko.zjedz();

        Komputer komputer = new Komputer("Komputer", 3000.00, 10, "Polska", "Dell Inspiron");
        komputer.wyswietlInformacje();
        System.out.println("Model: " + komputer.getModel());
        komputer.wlacz();
        komputer.uzyj();
        komputer.wylacz();

        Koszula koszula = new Koszula("Koszula", 120.00, 50, "Włochy", "L");
        koszula.wyswietlInformacje();
        System.out.println("Rozmiar: " + koszula.getRozmiar());
        koszula.wypierz();
        koszula.wyprasuj();
        koszula.zaloz();
    }
}