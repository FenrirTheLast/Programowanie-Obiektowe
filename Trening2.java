import java.util.Scanner;

public class Trening2 {
    public static void trojkiPitagorejskie(int n){
        for(int a = 1; a <= n; a++){
            for(int b =a; b<=n; b++){
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && a * a + b * b == c * c){
                    System.out.println("(" + a + "," + b + "," + c + ")");
                }
            }
        }
    }
    public static void funKwaRozwiazania(int n2){
        for(int a = -n2; a<= n2; a++){
            if(a == 0) continue;
            for(int b = -n2; b<= n2; b++){
                for(int c =-n2; c <= n2; c++){
                    int delta = b * b -4 * a * c;
                    if(delta >=0){
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
    }
    public static void funKwaDelta(int n3){
        for(int a = -n3; a <= n3; a++){
            if(a == 0) continue;
            for(int b = -n3; b<= n3; b++){
                for(int c = -n3; c <=n3; c++){
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0){
                        int sqrtDelta = (int) Math.sqrt(delta);
                        if (sqrtDelta * sqrtDelta == delta){
                            System.out.println("a = " + a + ", b = " + b + ", c = " + c + " (delta = " + delta + ")");
                        }
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n){
        for(int i = 2; i <= n; i++){
            boolean jestPierwsza = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    jestPierwsza = false;
                    break;
                }
            }
            if (jestPierwsza) {
                System.out.print(i + " ");
            }
        }
    }
    public static void liczbyPodzielne(int m, int n4){
        int min = (int) Math.pow(10, m - 1);
        int max = (int) Math.pow(10, m) - 1;

        for (int i  = min; i <+ max; i++){
            if(i % n4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void piramida(int n5, int variant){
        if(variant == 1){
            for(int i = 1; i<=n5; i++){
                for (int j = 0; j < n5 - i; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (variant == 2){
            for (int i = n5; i>=1; i--){
                for(int j = 0; j < n5 - i; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k < 2 * i -1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
          System.out.println("Wpisanie nieprawidłowego wariantu: wybierz 1 lub 2");
        }
    }
    public static int silnia(int n5){
        int wynik = 1;
        for(int i = 1; i <= n5; i++){
            wynik *= i;
        }
        return wynik;
    }
    public static int silniaPodwojna(int n5){
        int wynik = 1;
        for(int i = n5; i > 0; i -= 2){
            wynik *= i;
        }
        return wynik;
    }
    public static int silnia2(int m2, int n7){
        int wynik = 1;
        for(int i = n7; i > 0; i -= m2){
            wynik *= i;
        }
        return wynik;
    }
    public static int silnia3(int n5){
        int wynik = 1;
        for(int i =1; i <=n5; i++){
            wynik *= i;
        }
        return wynik;
    }
    public static int dwumianNewtona(int n5, int k2){
        if(k2 > n5){
            return 0;
        }
        int silniaN = silnia3(n5);
        int silniaK = silnia3(k2);
        int silniaNK = silnia3(n5 - k2);
        return silniaN / (silniaK * silniaNK);
    }
    public static void ciagFibonacciego(int n8){
        int a = 0;
        int b = 1;
        if(n8 >=1){
            System.out.print(a + " ");
        }
        if(n8 >= 2){
            System.out.print(b + " ");
        }
        for(int i = 3; i <=n8; i++){
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static int sumaNaturalnych(int n5){
        int suma = 0;
        for(int i = 1; i <= n5; i++){
            suma += i;
        }
        return suma;
    }
    public static int sumaParzystych(int n5){
        int suma = 0;
        for(int i =1; i<= n5; i++){
            suma += 2 * i;
        }
        return suma;
    }
    public static int sumaNieparzystych(int n5){
        int suma = 0;
        for(int i = 1; i <=n5; i++){
            suma = 2 * i -1;
        }
        return suma;
    }
    public static int sumaKwaNaturalnych(int n5){
        int suma = 0;
        for(int i = 1; i <= n5; i++){
            suma += i * i;
        } return suma;
    }
    public static int sumaSzeNaturalnych (int n5){
        int suma = 0;
        for(int i = 1; i <= n5; i++){
            suma += i * i * i;
        }
        return suma;
    }
    public static double sumaOdwNaturalnych(int n5){
        double suma = 0.0;
        for(int i = 1; i <= n5; i++){
            suma += 1.0 /i;
        }
        return suma;
    }
    public static boolean czyPalidrom(String wyraz){
        int długość = wyraz.length();

        for(int i = 0; i < długość /2; i++){
            if(wyraz.charAt(i) != wyraz.charAt(długość - 1 -i)){
                return false;
            }
        }
        return true;
    }
    public static void trojkatPascala(int n5){
        int[][] trojkat = new int[n5][n5];
        for(int i = 0; i < n5; i++){
            trojkat[i][0] = 1;
            for(int j = 1; j <= i; j++){
                trojkat[i][j] = trojkat[i - 1][j - 1] +trojkat[i - 1][j];
            }
        }
        for(int i = 0; i < n5; i++){
            for(int k = 0; k < n5; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<= i; j++){
                System.out.print(trojkat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean czyPalindrom2(int n5){
        int orginalna = n5;
        int odwrocona = 0;

        while (n5 > 0){
            int cyfra = n5 % 10;
            odwrocona = odwrocona * 10 + cyfra;
            n5 = n5 /10;
        }
        return orginalna == odwrocona;
    }
    public static boolean czyDoskonala(int n5){
        int suma =0;
        for(int i = 1; i<= n5 /2; i++){
            if( n5 % i == 0){
                suma += i;
            }
        }
        return suma == n5;
    }
    public static boolean czyPierwsza(int n5){
        if(n5 <= 1){
            return false;
        }
        for(int i = 2; i * i <=n5; i++){
            if(n5 % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int NWD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] wczytajTablice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę elementów tablicy: ");
        int n = scanner.nextInt();

        int[] tablica = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public static void podzbiory(int[] tab){
        int n = tab.length;
        int liczbaPodzbiorow = (int) Math.pow(2, n);
        for( int i = 0; i < liczbaPodzbiorow; i++){
            System.out.print("{ ");
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
        }
    }





    public static void main(String[] args) {
        int n = 20;
        trojkiPitagorejskie(n);

        int n2= 5;
        funKwaRozwiazania(n2);

        int n3 =5;
        funKwaDelta(n3);

        System.out.print("Liczby pierwsze od 2 do " + n + ": ");
        liczbyPierwsze(n);

        int m = 2;
        int n4 = 3;
        System.out.println("");
        System.out.print("liczby " + m + "-cyfrowe podzielne przez " + n + ": ");
        liczbyPodzielne(m, n4);

        int n5 = 6;
        int varinat = 1;
        System.out.println("Piramida o wysokości " + n5 + ", wariant " + varinat +": " );
        piramida(n5, varinat);

        int wynikSilnia = silnia(n5);
        System.out.println("Silnia liczby " + n5 + " wynosi: " + wynikSilnia);

         int wynikSilniaPodwojona = silniaPodwojna(n5);
         System.out.println("Silnia podwójna liczby " + n5 + " wynosi: " + wynikSilniaPodwojona);

         int m2 = 2;
         int n7 = 8;
         int wynikSilni2 = silnia2(m2,n7);
         System.out.println("Silnia " + m2 + "-ta liczby " + n7 + " wynosi: " + wynikSilni2);

         int k2 =2;
         int wynikDwumian = dwumianNewtona(n5,k2);
         System.out.println("Dwumian Newtona (" + n5 + " po " + k2 + ") wynosi: " + wynikDwumian);
         int n8 = 10;
         System.out.println("Pierwsze " + n + " elementów ciągu Finabociego: ");
         ciagFibonacciego(n8);

        System.out.println("Suma pierwszych " + n5 + " liczb naturalnych: " + sumaNaturalnych(n));
        System.out.println("Suma pierwszych " + n5 + " liczb parzystych: " + sumaParzystych(n));
        System.out.println("Suma pierwszych " + n5 + " liczb nieparzystych: " + sumaNieparzystych(n));
        System.out.println("Suma kwadratów pierwszych " + n5 + " liczb naturalnych: " + sumaKwaNaturalnych(n));
        System.out.println("Suma sześcianów pierwszych " + n5 + " liczb naturalnych: " + sumaSzeNaturalnych(n));
        System.out.println("Suma odwrotności pierwszych " + n5 + " liczb naturalnych: " + sumaOdwNaturalnych(n));

        String wyraz = "elektroradiolog";
        if(czyPalidrom(wyraz)){
            System.out.println("Wyraz '" + wyraz + "' jest palindromem.");
        } else {
            System.out.println("Podany wyraz '" + wyraz + "' nie jest palindromem");
        }
        trojkatPascala(n5);

        int liczba = 12321;
        if(czyPalindrom2(liczba)){
            System.out.println("Liczba " + liczba + " jest palindromem");
        } else {
            System.out.println("Liczba " + liczba + " nie jest palindromem");
        }
        int liczba4 = 6;
        if(czyDoskonala(liczba4)){
            System.out.println("Liczba " + liczba4 + " jest doskonała.");
        } else {
            System.out.println("Liczba " + liczba4 + " nie jest doskonała.");
        }

        int liczba5 = 19;
        if(czyPierwsza(liczba5)){
            System.out.println("Liczba " + liczba5 + " jest pierwsza");
        } else {
            System.out.println("Liczba " + liczba5 + " nie jest pierwsza");
        }

        int a = 48;
        int b = 18;
        System.out.println("NWD liczb " + a + " i " + b + " wynosi: " + NWD(a,b));

        int[] tablica = wczytajTablice();
        System.out.print("Wprowadzone liczby: ");
        System.out.println(" ");
        for(int liczba6 : tablica){
            System.out.println(liczba6 + " ");
        }

        int[] tab = {1, 2, 3};
        podzbiory(tab);
        }

    }

