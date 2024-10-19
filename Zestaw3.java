import java.util.Arrays;
import java.util.Scanner;

public class Zestaw3 {
    public static void main(String[] args) {
        //zad14
        int n = 5;
        trojkatPascala(n);

        //zad15
        int liczba = 4321234;
        if (czyPalindrom(liczba)){
            System.out.println(liczba + " jest palindromem.");
        } else {
            System.out.println(liczba + " nie jest palindromem");
        }

        //zad1
        int n1 = 20;
        trojkiPitagorejskie(n1);

        //zad2
        int n2 = 10;
        funKwaRozwiazania(n2);

        //zad3
        int n3 = 5;
        funKwaDelta(n3);

        //zad4
        int n4 = 50;
        liczbyPierwsze(n4);

        //zad5
        int m = 3;
        int n5= 7;
        liczbyPodzielne(m,n5);


        //zad6
        int n6 = 5;
        int variant = 1; // są dwa (1 i 2)
        piramida(n6, variant);

        //zad7
        int n7 = 5;
        System.out.println(n7 + "! = " + silnia(n7));

        //zad8
        int n8 = 7;
        System.out.println((n8 + "!! = " + silniaPodwojna(n8)));

        //zad9
        int m2 = 2;
        int n9 = 4;
        long wynik = silnia(m2,n9);
        if(wynik != -1){
            System.out.println("m-sta silnia liczby " + n9 + " przy m = " + m2 + " wynosi: " + wynik);
        } else {
            System.out.println("Nie udało się obliczyć m-tej silni liczby " + n + " z powodu przekroczenia zakresu.");
        }

        //zad10
        int n10 = 5;
        int k = 2;
        System.out.println("Dwumian Newtona " + n + " po " + k + " wynosi: " + dwumianNewtona(n10,k));

        //zad11
        int n11 = 10;
        ciagFibonacciego(n11);

        //zad12
        int n12 = 5;
        System.out.println("Suma liczb naturalnych od 1 do " + n12 + ": " + sumaNaturalnych(n12));
        System.out.println("Suma liczb parzystych od 1 do " + n12 + ": " + sumaParzystych(n12));
        System.out.println("Suma liczb nieparzystych od 1 do " + n12 + ": " + sumaNieparzystych(n12));
        System.out.println("Suma kwadratów liczb naturalnych od 1 do " + n12 + ": " + sumaKwaNaturalnych(n12));
        System.out.println("Suma sześcianów liczb naturalnych od 1 do " + n12 + ": " + sumaSzeNaturalnych(n12));
        System.out.println("Suma odwrotności liczb naturalnych od 1 do " + n12 + ": " + sumaOdwNaturalnych(n12));

        //zad13
        String wyraz = "programowanie";
        if(czyPalindrom(wyraz)) {
            System.out.println(wyraz + " jest palindromem.");
        } else {
            System.out.println(wyraz + " nie jest palindromem.");
        }

        //zad16
        int n16 = 6;
        if (czyDoskonala(n16)){
            System.out.println(n16 + " jest liczbą doskonałą.");
        } else {
            System.out.println(n16 + " nie jest liczbą doskonałą.");
        }
        //zad17
        int n17 = 29;
        if (czyPierwsza(n17)){
            System.out.println(n17 + " jest liczbą pierwszą.");
        } else {
            System.out.println(n17 + " nie jest liczbą pierwszą.");
        }

        //zad18
        int a = 56;
        int b = 98;
        System.out.println("Największy wspólny dzielnik (" + a + ", " + b + ") wynosi: " + NWD(a, b));

        //zad19
        int[] wprowadzonaTablica = wczytajTablice();
        System.out.println("Wprowadzone liczby:");
        for (int LICZBA: wprowadzonaTablica) {
            System.out.println(LICZBA);
        }

        //zad20
        int[] tablica = {1,2,3};
        podzbiory(tablica);

    }
    //zad14
    public static void trojkatPascala(int n) {
        for (int i = 0; i < n; i++) {
            int a = 1;
            System.out.format("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a = a * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    //zad15
    public static boolean czyPalindrom(int n) {
        int orginalne = n;
        int odwrocone = 0;

        while (n > 0) {
            int cyfra = n % 10;
            odwrocone = odwrocone * 10 + cyfra;
            n /= 10;
        }
        return orginalne == odwrocone;
    }

    //zad1
    public static void trojkiPitagorejskie(int n1){
        for (int a = 1; a <= n1; a++){
            for(int b = a + 1; b <=n1; b++){
                for(int c = b + 1; c <= n1; c++){
                    if(a * a + b * b == c * c){
                        System.out.println("(a = " + a + ", b = " + b + ", c = " + c + " )");
                    }
                }
            }
        }
    }
    //zad2
    public static void funKwaRozwiazania(int n2){
        for (int a = -n2; a <= n2; a++){
            if (a == 0) continue;
            for (int b = -n2; b <= n2; b++){
                for (int c = -n2; c <= n2; c++){
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> Δ = " + delta);
                    }
                }
            }
        }
    }

    //zad3
    public static void funKwaDelta(int n3) {
        for (int a = -n3; a <= n3; a++) {
            if (a == 0) continue;
            for (int b = -n3; b <= n3; b++) {
                for(int c = -n3; c <= n3;c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >=0){
                        int pierwDelta = (int) Math.sqrt(delta);
                        if (pierwDelta * pierwDelta == delta) {
                            int pierwRoot = (int) Math.sqrt(pierwDelta);
                            if(pierwRoot * pierwRoot == pierwDelta) {
                                System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> Δ = " + delta + ", √Δ = " + pierwDelta);
                            }
                        }
                    }
                }
            }
        }

    }


    //zad4
    public static void liczbyPierwsze(int n4){
        boolean[] czyPierwsza = new boolean[n4 + 1];
        Arrays.fill(czyPierwsza, true);
        czyPierwsza[0] = false;
        czyPierwsza[1] = false;
        for (int p = 2; p * p <= n4; p++){
            if(czyPierwsza[p]){
                for (int i = p * p; i <= n4; i+= p){
                    czyPierwsza[i] = false;
                }
            }
        }
        System.out.println("Liczby pierwsze do 2 do " + n4 + ":");
        for (int p = 2; p <= n4; p++){
            if (czyPierwsza[p]){
                System.out.print(p + " ");
            }
        }
        System.out.println();
    }

    //zad5
    public static void liczbyPodzielne(int m, int n5){
        int min = (int) Math.pow(10, m - 1);
        int max = (int) Math.pow(10,m) - 1;
        System.out.println("liczby " + m + "-cyfrowe podzielnie przez " + n5 + ":");
        for(int i = min; i <= max; i ++){
            if(i % n5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //zad6
    public static void piramida(int n6, int variant){
        if (variant == 1){
            wariant1(n6);
        } else if (variant == 2){
            wariant2(n6);
        }else{
            System.out.println("Nieprawidłowy wybrany wariant. Są tylko 1 i 2!");
        }
    }
    public static void wariant1(int n6){
        for (int i = 1; i <= n6; i++){
            for(int j = 0; j < n6 - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }public static void wariant2(int n6){
        for (int i = n6; i >= n6 - i; i--){
            for(int j = 0; j < n6 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //zad7
    public static long silnia(int n7){
        long wynik = 1;
        for (int i = 2; i <= n7; i++){
            wynik *= i;
        }
        return wynik;
    }

    //zad8
    public static long silniaPodwojna(int n8){
        long wynik = 1;
        for(int i = n8; i > 0; i -= 2){
            wynik *= i;
        }
        return wynik;
    }

    //zad9
    public static long SILNIA(long n9){
        long wynik = 1;
        for (long i = 2; i <= n9; i++){
            wynik *= i;
            if(wynik < 0) {
                System.out.println("Przekroczono zakres dla silni: " + n9);
                return -1;
            }
        }
        return wynik;
    }
    public static long silnia(int m2,int n9){
        long wynik = n9;
        while(m2-- >0) {
            wynik = SILNIA(wynik);
            if(wynik == -1){
                return -1;
            }
        }
        return wynik;
    }

    //zad10
    public static long SILNIA2 (int n10){
        long wynik = 1;
        for(int i = 2; i <= n10; i++) {
            wynik *= i;
        }
        return wynik;
    }
    public static long dwumianNewtona(int n10,int k){
        if(k > n10 || k < 0) {
            return 0;
        }
        return SILNIA2(n10) / (SILNIA2(k) * SILNIA2(n10 - k));
    }

    //zad11
    public static void ciagFibonacciego(int n11){
        if (n11 <= 0){
            System.out.println("Liczba elementów musi być większa niż 0");
            return;
        }
        long a = 0, b = 1;
        for (int i = 0; i < n11; i++){
            System.out.print(a + " ");
            long A = a + b;
            a = b;
            b = A;
        }
        System.out.println();
    }

    //zad12
    public static long sumaNaturalnych(int n12){
        long suma = 0;
        for (int i = 1; i <= n12; i++) {
            suma += i;
        }
        return suma;
    }
    public static long sumaParzystych(int n12){
        long suma = 0;
        for (int i = 2; i <= n12; i += 2){
            suma += i;
        }
        return suma;
    }
    public static long sumaNieparzystych(int n12){
        long suma = 0;
        for( int i = 1; i <= n12; i += 2){
            suma += i;
        }
        return suma;
    }
    public static long sumaKwaNaturalnych(int n12){
        long suma = 0;
        for (int i = 1; i <= n12; i++){
            suma += i * i;
        }
        return suma;
    }
    public static long sumaSzeNaturalnych(int n12){
        long suma = 0;
        for ( int i = 1; i <= n12; i++){
            suma += i * i * i;
        }
        return suma;
    }
    public static double sumaOdwNaturalnych(int n12){
        double suma = 0;
        for (int i = 1; i <= n12; i++){
            suma +=1.0 / i;
        }
        return suma;
    }

    //zad13
    public static boolean czyPalindrom(String wyraz) {
        int dlugosc = wyraz.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (wyraz.charAt(i) != wyraz.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    //zad16
    public static boolean czyDoskonala(int n16){
        if (n16 <= 1) {
            return false;
        }
        int sumaDzielnikow = 0;
        for(int i = 1; i <= n16 / 2; i++) {
            if(n16 % i == 0) {
                sumaDzielnikow += i;
            }
        }
        return sumaDzielnikow == n16;
    }

    //zad17
    public static boolean czyPierwsza(int v){
        if(v <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(v); i++){
            if(v % i == 0){
                return false;
            }

        }
        return true;
    }

    //zad18
    public static int NWD(int a, int b) {
        while (b != 0) {
            int reszta = a % b;
            a = b;
            b = reszta;
        }
        return a;
    }

    //zad19
    public static int[] wczytajTablice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    //zad20
    public static void podzbiory(int[] tab){
        int n = tab.length;
        int liczbaPodzbiorow = 1 << n;

        System.out.println("Podzbiory tablicy: ");
        for(int i = 0; i < liczbaPodzbiorow; i++) {
            StringBuilder podzbior = new StringBuilder("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) !=0) {
                    podzbior.append(tab[j]).append(" ");
                }
            }
            podzbior.append("}");
            System.out.println(podzbior.toString());
        }
    }






}