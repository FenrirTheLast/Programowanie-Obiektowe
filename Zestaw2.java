import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zestaw2 {
    public static void main(String[] args) {

        //zad1

        double wynik_A = 23.0 + 76;
        System.out.println("23.0 + 76 = " + wynik_A + " (typ: double)");

        double wynik_B = 41 * 2.0 + 3;
        System.out.println("41 * 2.0 + 3 = " + wynik_B + " (typ: double)");

        int wynik_C = 5-33;
        System.out.println("5 - 33 = " + wynik_C + " (typ: int");

        int wynik_D = 109%3;
        System.out.println("109 % 3 = " + wynik_D + " (typ: int)");

        int wynik_E = 50/2;
        System.out.println("50 / 2 = " + wynik_E + " (typ: int)");

        int wynik_F = 4|2;
        System.out.println("4 | 2 = " + wynik_F + " (typ: int, OR bitowe");

        int wynik_G = 3^5;
        System.out.println("3 ^ 5 = " + wynik_G + " (typ: int, XOR)");

        int wynik_H = 7&9;
        System.out.println("7 & 9 = " + wynik_H + " (typ: int, AND bitowe)");


        //zad2

        double wynik_a = (Math.sqrt(7) -1) / 2 + Math.pow(3,3) % 2;
        System.out.println("Wynik a: " + (int) wynik_a);

        int rokUrodzenia = 2000;
        int dzienUrodzenia = 11;
        int miesiacUrodzenia = 10;

        double wynik_b = rokUrodzenia / (double)(dzienUrodzenia * miesiacUrodzenia);
        System.out.println("Wynik b: " + (int) wynik_b);

        double wynik_c = 3 + Math.sqrt(3) / (Math.sqrt(5.0 / 2) /3) + 1;
        System.out.println("Wynik c: " + (int) wynik_c);

        int a = 10;
        int b = 3;
        int c = 2;

        int wynik_d = a % b % c;
        System.out.println("Wynik d: " + (int) wynik_d);

        int nazwisko = 4; //Wilk
        int imie = 6; //Damian
        double wynik_e = (nazwisko % imie + 1) / Math.pow(2, 1.0 / 4.0);
        System.out.println("Wynik e: " + (int) wynik_e);

        //zad3

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsze słowo: ");
        String pierwsze_slowo = scanner.nextLine();

        System.out.print("Podaj drugie słowo: ");
        String drugie_slowo = scanner.nextLine();

        System.out.println("Pierwsze słowo: " + pierwsze_slowo);
        System.out.println("Drugie słowo: " + drugie_slowo);

        //zad4

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj 1 liczbę: ");
            double liczba_a = Double.parseDouble(reader.readLine());

            System.out.print("Podaj 2 liczbę: ");
            double liczba_b = Double.parseDouble(reader.readLine());

            double suma = liczba_a + liczba_b;
            double roznica = liczba_a - liczba_b;
            double iloczyn = liczba_a * liczba_b;
            double iloraz = 0;
            if (liczba_b != 0) {
                iloraz = liczba_a / liczba_b;
            } else {
                System.out.println("Nie można dzielić przez 0!!!");
            }
            System.out.println("Suma: " + suma);
            System.out.println("Różnica: " + roznica);
            System.out.println("Iloczyn: " + iloczyn);
            if (liczba_b != 0) {
                System.out.println("Iloraz: " + iloraz);
            }

        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        //zad5

        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj liczbę x: ");
            double x = Double.parseDouble(reader.readLine());

            double powiększona_o_140 = x + 140;
            double pomniejszona_o_31 = x - 31;
            double powiększona_7_razy = x * 7;
            double pomniejszona_13_razy = x / 13;
            double modulo_7 = x % 7;
            int czesc_calkowita_z_dzielenia_przez_4 = (int) x/ 4;
            double potega_45 = Math.pow(x,45);
            int iloraz_bitowy_67 = (int) x & 67;
            int suma_bitowa_59 = (int) x | 59;
            int xor_z_23 = (int) x ^ 23;
            int przesuniecie_w_lewo = (int) x << 5;
            int przesuniecie_w_prawo = (int) x >> 6;

            System.out.println("Powiększona o 140: " + powiększona_o_140);
            System.out.println("Pomniejszona o 31: " + pomniejszona_o_31);
            System.out.println("Powiększona 7 razy: " + powiększona_7_razy);
            System.out.println("Pomniejszona 13 razy: " + pomniejszona_13_razy);
            System.out.println("Modulo 7: "+ modulo_7);
            System.out.println("Część całkowita z dzilenia przez 4: " + czesc_calkowita_z_dzielenia_przez_4);
            System.out.println("Podniesiona do potęgi 45: " + potega_45);
            System.out.println("Iloraz bitowy z 67: " + iloraz_bitowy_67);
            System.out.println("Suma bitowa z 59: " + suma_bitowa_59);
            System.out.println("XOR z 23: " + xor_z_23);
            System.out.println("Przesunięta o 5 bitów w lewo: " + przesuniecie_w_lewo);
            System.out.println("Przesunięcie o 6 bitów w prawo: " + przesuniecie_w_prawo);

        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        } finally {
            if(reader != null){
                try{
                    reader.close();
                } catch (Exception e) {
                    System.out.println("Wystąpił problem przy zamykaniu: " + e.getMessage());
                }
            }
        }
    }
}
