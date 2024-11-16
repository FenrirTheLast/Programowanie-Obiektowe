import java.util.Scanner;
public class Trening4 {

    //Wypisz w granicach n wszystkie trójki pitagorejskie.
    //trojkiPitagorejskie(n)

    public static void TrojkiPitagorejskie(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && a * a + b * b == c * c) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }


    //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji 
    //kwadratowej dla których istnieją rozwiązania.
    //funKwaRozwiazania(n)

    public static void funKwaRozwiazania(int n) {
        for (int a = -n; a <= n; a++) {
            if (a == 0) continue;

            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
    }

    //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji kwadratowej dla których
    // pierwiastek z delty jest kwadratem liczby naturalnej.
    //funKwaDelta(n)

    public static void funKwaDelta(int n) {
        for (int a = -n; a <= n; a++) {
            if (a == 0) continue;

            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        int sqrtDelta = (int) Math.sqrt(delta);
                        if (sqrtDelta * sqrtDelta == delta) {
                            System.out.println("a = " + a + ", b = " + b + ", c = " + c + " (delta = " + delta + ")");
                        }
                    }
                }
            }
        }
    }

    // Wypisz wszystkie liczby pierwsze od 2 do n.
    //liczbyPierwsze(n)

    public static void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            boolean jestPierwsza = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    jestPierwsza = false;
                    break;
                }
            }
            if (jestPierwsza) {
                System.out.print(i + " ");
            }
        }
    }
    //Wypisz wszystkie liczby naturalne m-cyfrowe, które podzielne są przez n.
    //liczbyPodzielne(m,n)

    public static void liczbyPodzielne(int m, int n) {
        int min = (int) Math.pow(10, m - 1);
        int max = (int) Math.pow(10, m) - 1;

        for (int i = min; i <= max; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Wypisz piramidę z gwiazdek w dwóch wariantach, której wysokość jest liczbą n.
    //piramida(n,variant)

    public static void piramida(int n, int variant) {
        if (variant == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    //Oblicz silnie liczby n.
    //silnia(n)

    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    //Oblicz silnie podwójną liczby n.
    //silniaPodwojna(n)

    public static int silniaPodwojna(int n) {
        int wynik = 1;
        for (int i = n; i > 0; i -= 2) {
            wynik *= i;
        }
        return wynik;
    }

    //Oblicz silnie m-tą liczby n.
    //silnia(m,n)

    public static int silnia2(int m, int n) {
        int wynik = 1;
        for (int i = n; i > 0; i -= m) {
            wynik *= i;
        }
        return wynik;
    }

    //Oblicz dwumian Newtona n po k.
    //dwumianNewtona(n,k)

    public static int dwumianNewtona(int n, int k) {
        if (k > n) {
            return 0;
        }
        int silniaN = silnia(n);
        int silniaK = silnia(k);
        int silniaNK = silnia(n - k);

        return silniaN / (silniaK * silniaNK);
    }

    //Wypisz n pierwszych elementów ciągu Fibonacciego.
    //ciagFibonacciego(n)

    public static void ciagFibonaciego(int n) {
        int a = 0;
        int b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    //Oblicz sumę n liczb:
    //• Naturalnych sumaNaturalnych(n)

    public static int sumaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }


    //Oblicz sumę n liczb:
    //• Parzystych sumaParzystych(n)

    public static int sumaParzystych(int n) {
        int suma = 1;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i;
        }
        return suma;
    }


    //Oblicz sumę n liczb:
    //• Nieparzystych sumaNieparzystych (n)

    public static int sumaNieparzystych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i - 1;
        }
        return suma;
    }

    //Oblicz sumę n liczb:
    //• Kwadratów liczb naturalnych sumaKwaNaturalnych(n)

    public static int sumaKwaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    //Oblicz sumę n liczb:
    //• Sześcianów liczb naturalnych sumaSzeNaturalnych(n)

    public static int sumaSzeNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i * i;
        }
        return suma;
    }

    //Oblicz sumę n liczb:
    //• Odwrotności liczb naturalnych sumaOdwNaturalnych(n)

    public static double sumaOdwNaturalnych(double n) {
        double suma = 0.0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        return suma;
    }

    //Sprawdź czy podany wyraz jest palindromem. (bool)
    //czyPalindrom(wyraz)

    public static boolean czyPalindrom(String wyraz) {
        int długosc = wyraz.length();

        for (int i = 0; i < długosc / 2; i++) {
            if (wyraz.charAt(i) != wyraz.charAt(długosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Wypisz trójkąt Pascala, którego wysokość jest liczbą n.
    // (+1 pkt) trojkatPascala(n)

    public static void trojkaPascala(int n){
        int[][] trojkat = new int[n][n];
        for (int i = 0; i < n; i++){
            trojkat[i][0] = 1;

            for(int j = 1; j <= i; j++){
                trojkat[i][j] = trojkat[i - 1][j - 1] + trojkat[i - 1][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(trojkat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Sprawdź czy podana liczba jest palindromem. (bool) czyPalindrom(n)

    public static boolean czyPalindromLiczba(int n) {
        int orginalna = n;
        int odwrocona = 0;

        while(n > 0){
            int cyfra = n % 10;
            odwrocona = odwrocona * 10 + cyfra;
            n = n /10;
        }
        return orginalna == odwrocona;
    }


    // Sprawdź czy wprowadzona liczba jest doskonała. (bool)
    //czyDoskonala(n)

    public static boolean czyDoskonala(int n){
        int suma = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                suma +=i;
            }
        }
        return suma == n;
    }

    //Sprawdź czy wprowadzona liczba jest pierwsza. (bool)
    //czyPierwsza(n)

    public static boolean czyPierwsza(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //Wyznacz największy wspólny dzielnik dwóch liczb.
    //NWD(a,b)

    public static int NWD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Funkcja wczytuje liczbę n, a następnie tworzy tablicę n wprowadzonych liczb
    // przez użytkownika, którą zwraca.
    //wczytajTablice()

    public static int[] wczytajTablice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów tablicy: ");
        int n = scanner.nextInt();

        int[] tablica = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        return tablica;
    }


    // Wypisz wszystkie podzbiory tablicy n-elementowej.
    //podzbiory(tab)

    public static void podzbiory(int[] tab){
        int n = tab.length;
        int liczbaPodzbiorow = (int) Math.pow(2,n);

        for(int i = 0; i < liczbaPodzbiorow; i++){
            System.out.print("{ ");
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) !=0) {
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
        }
    }



    public static void main(String[] args) {

        //Wypisz w granicach n wszystkie trójki pitagorejskie.
        //trojkiPitagorejskie(n)

        int n = 5;
        TrojkiPitagorejskie(n);

        //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji kwadratowej dla których istnieją rozwiązania.
        //funKwaRozwiazania(n)

        int n2 = 5;
        funKwaRozwiazania(n2);

        //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji kwadratowej dla których
        // pierwiastek z delty jest kwadratem liczby naturalnej.
        //funKwaDelta(n)

        int n3 = 3;
        funKwaDelta(n3);

        // Wypisz wszystkie liczby pierwsze od 2 do n.
        //liczbyPierwsze(n)

        int n4 = 20;
        System.out.println("Liczby pierwsze od 2 do " + n4 + ":");
        liczbyPierwsze(n4);
        System.out.println();

        //Wypisz wszystkie liczby naturalne m-cyfrowe, które podzielne są przez n.
        //liczbyPodzielne(m,n)

        int m = 2;
        int n5 = 3;

        System.out.println("Liczby " + m + "-cyfrowe podzielenie przez " + n5 + ":");
        liczbyPodzielne(m, n5);
        System.out.println();

        //Wypisz piramidę z gwiazdek w dwóch wariantach, której wysokość jest liczbą n.
        //piramida(n,variant)

        int n6 = 5;
        int variant = 1;

        System.out.println("Piramida o wysokości " + n6 + ":");
        piramida(n6, variant);
        System.out.println();


        //Oblicz silnie liczby n.
        //silnia(n)

        int n7 = 5;
        int wynikSilni = silnia(n7);
        System.out.println("Silnia liczby " + n + " wynosi: " + wynikSilni);
        System.out.println();

        //Oblicz silnie podwójną liczby n.
        //silniaPodwojna(n)

        int n8 = 5;
        int wynikPodwijnejSilni = silniaPodwojna(n8);
        System.out.println("Silnia podwójna liczby " + n8 + " wynosi: " + wynikPodwijnejSilni);
        System.out.println();

        //Oblicz silnie m-tą liczby n.
        //silnia(m,n)

        int m2 = 3;
        int n9 = 9;
        int wynikSilniaM = silnia2(m2, n9);
        System.out.print("Silnia " + m2 + "-ta liczby " + n9 + " wynosi: " + wynikSilniaM);
        System.out.println();

        //Oblicz dwumian Newtona n po k.
        //dwumianNewtona(n,k)

        int n10 = 6;
        int k3 = 4;

        int wynikDwumian = dwumianNewtona(n10, k3);
        System.out.println("Dwumian Newtona (" + n10 + " po " + k3 + ") wynosi: " + wynikDwumian);


        //Wypisz n pierwszych elementów ciągu Fibonacciego.
        //ciagFibonacciego(n)

        int n11 = 14;

        System.out.println("Pierwsze " + n + " elementów ciągu Fibonaciego");
        ciagFibonaciego(n11);
        System.out.println();


        //Oblicz sumę n liczb:
        //•Naturalnych sumaNaturalnych(n)
        //•Parzystych sumaParzystych(n)
        //•Nieparzystych sumaNieparzystych (n)
        //•Kwadratów liczb naturalnych sumaKwaNaturalnych(n)
        //•Sześcianów liczb naturalnych sumaSzeNaturalnych(n)
        //•Odwrotności liczb naturalnych sumaOdwNaturalnych(n)


        int n12 = 10;
        System.out.println("Suma pierwszych " + n12 + " liczb naturalnych: " + sumaNaturalnych(n12));
        System.out.println("Suma pierwszych " + n12 + " liczb parzystych: " + sumaParzystych(n12));
        System.out.println("Suma pierwszych " + n12 + " liczb nieparzystych " + sumaNieparzystych(n12));
        System.out.println("Suma kwadratów " + n12 + " liczb naturalnych " + sumaKwaNaturalnych(n12));
        System.out.println("Suma sześcianów pierwszych " + n12 + " liczb naturalnych " + sumaSzeNaturalnych(n12));
        System.out.println("Suma odwrotności pierwszych " + n12 + " liczb naturalnych " + sumaOdwNaturalnych(n12));


        //Sprawdź czy podany wyraz jest palindromem. (bool)
        //czyPalindrom(wyraz)

        String wyraz = "kajak";
        if (czyPalindrom(wyraz)) {
            System.out.println("Wyraz jest palindromem");
        } else {
            System.out.println(" Wyraz nie jest palindromem");
        }
        System.out.println();

        //Wypisz trójkąt Pascala, którego wysokość jest liczbą n.
        // (+1 pkt) trojkatPascala(n)

        int n13 = 5;
        trojkaPascala(n7);
        System.out.println();

        //Sprawdź czy podana liczba jest palindromem. (bool) czyPalindrom(n)

        int liczba = 123454321;
        if (czyPalindromLiczba(liczba)){
            System.out.println(liczba + " jest palindromem");
        } else {
            System.out.println(liczba + " nie jest palindromem");
        }


        // Sprawdź czy wprowadzona liczba jest doskonała. (bool)
        //czyDoskonala(n)

        int liczba2 = 8;
        if(czyDoskonala(liczba2)){
            System.out.println(liczba2 + " Tak jest doskonała");
        } else {
            System.out.println(liczba2 + " Nie jest doskonała");
        }
        System.out.println();


        //Sprawdź czy wprowadzona liczba jest pierwsza. (bool)
        //czyPierwsza(n)

        int liczba3 = 17;
        if(czyPierwsza(liczba3)){
            System.out.println(liczba3 + " jest pierwsza");
        } else {
            System.out.println(liczba3 + " nie jest pierwsza");
        }
        System.out.println();


        //Wyznacz największy wspólny dzielnik dwóch liczb.
        //NWD(a,b)

        int a = 48;
        int b = 12;
        System.out.println("NWD liczb: " + a + " i " + b + " wynosi: " + NWD(a,b));


        //Funkcja wczytuje liczbę n, a następnie tworzy tablicę n wprowadzonych liczb
        // przez użytkownika, którą zwraca.
        //wczytajTablice()


        int[] tablica = wczytajTablice();

        System.out.println("Wprowadzone liczby: ");
        for(int liczba5 : tablica){
            System.out.print(liczba5 + " ");
        }
        System.out.println();


        // Wypisz wszystkie podzbiory tablicy n-elementowej.
        //podzbiory(tab)

        int[] tab = {1,2,3};
        podzbiory(tab);
        System.out.println();

        //Wyszukiwać kolejne elementy, które będą dodatnie 
        //lub ujemne 
        
         // Krok 1: Tworzymy listę liczb
        int[] liczby = {1, -2, 3, -4, 5, -6, 7, -8};
        
        // Krok 2: Wyświetlamy informację, co robimy
        System.out.println("Szukamy liczb, które są na przemian dodatnie i ujemne:");

        // Krok 3: Sprawdzamy każdą liczbę i kolejną obok niej
        for (int i = 0; i < liczby.length - 1; i++) {
            // Czy obecna liczba jest dodatnia, a następna ujemna?
            // Lub odwrotnie: obecna ujemna, a następna dodatnia?
            if ((liczby[i] > 0 && liczby[i + 1] < 0) || (liczby[i] < 0 && liczby[i + 1] > 0)) {
                // Jeśli tak, wyświetlamy je
                System.out.println(liczby[i] + " i " + liczby[i + 1]);
            }
        }
    }
}
