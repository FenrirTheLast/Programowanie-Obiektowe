import java.util.HashSet;
import java.util.Random;

public class Zestaw4 {

    //zad1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tablica = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return tablica;
    }


    //zad2
    public static void wypiszTablice(int[] tab, int n, int m) {
        int licznik = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(licznik < tab.length){
                    System.out.printf("%5d", tab[licznik]);
                } else {
                    System.out.printf("%5s", " ");
                }
                licznik++;
            }
            System.out.println();
        }
    }

    //zad 3
    public static int ileNieparzystych(int[] tab){
        int count = 0;
        for(int num : tab){
            if (num % 2 != 0) count++;
        }
        return count;
    }
    public static int ileParzystych(int[] tab){
        int count = 0;
        for(int num : tab){
            if(num % 2 == 0) count++;
        }
        return count;
    }
    public static int ileDadatnich(int[] tab){
        int count = 0;
        for (int num : tab) {
            if(num > 0) count++;
        }
        return count;
    }
    public static int ileUjemnych(int[] tab){
        int count = 0;
        for(int num : tab){
            if(num < 0) count++;
        }
        return count;
    }
    public static int ileZerowych(int[] tab){
        int count = 0;
        for(int num : tab){
            if (num == 0) count++;
        }
        return count;
    }
    public static int ileMaxymalnych(int[] tab){
        int max = tab[0];
        int count = 0;
        for(int num : tab) {
            if(num > max) max = num;
        }
        for (int num : tab){
            if (num == max) count++;
        }
        return count;
    }
    public static int ileMinimalnych(int[] tab){
        int min = tab[0];
        int count = 0;
        for (int num : tab) {
            if(num < min) min = num;
        }
        for (int num : tab){
            if(num == min) count++;
        }
        return count;
    }
    public static int ileUnikalnych(int[] tab) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int num : tab) {
            uniqueElements.add(num);
        }
        return uniqueElements.size();
    }

    //zad4
    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int num : tab) {
            if (num > 0) suma += num;
        }
        return suma;
    }
    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for(int num : tab){
            if (num < 0) suma += num;
        }
        return suma;
    }
    public static double sumaOdwrotnosci(int[] tab) {
        double suma = 0.0;
        for(int num : tab) {
            if (num != 0){
                suma += 1.0 / num;
            }
        }
        return suma;
    }

    public static double sredniaArytmetyczna(int[] tab){
        int suma = 0;
        for (int num : tab) {
            suma += num;
        }
        return (double) suma / tab.length;
    }

    public static double sredniaGeometryczna(int[] tab){
        double iloczyn = 1.0;
        for (int num : tab) {
            iloczyn *= Math.abs(num);
        }
        return Math.pow(iloczyn, 1.0 / tab.length);
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double sumaOdwrotnosci = 0.0;
        for (int num : tab) {
            if (num != 0) {
                sumaOdwrotnosci += 1.0 / num;
            }
        }
        return tab.length / sumaOdwrotnosci;
    }

    //zad5
    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        int[] wynik = new int[tab.length];
        for(int i = 0; i < tab.length; i++) {
            wynik[i] = a * tab[i] + b;
        }
        return wynik;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        int[] wynik = new int[tab.length];
        for (int i = 0; i < tab.length; i++){
            wynik[i] = a * tab[i] * tab[i] + b * tab[i] + c;
        }
        return wynik;
    }

    public static double[] funkcjaWykladnicza(int[] tab, int a){
        double[] wynik = new double[tab.length];
        for( int i = 0; i < tab.length; i++){
            wynik[i] = Math.pow(a, tab[i]);
        }
        return wynik;
    }

    public static int[] funkcjaSignum(int[] tab){
        int[] wynik = new int[tab.length];
        for (int i = 0; i < tab.length; i++){
            if (tab[i] > 0) wynik[i] = 1;
            else if (tab[i] < 0) wynik[i] = -1;
            else wynik[i] = 0;
        }
        return wynik;
    }


    //zad6

    public static int najdluzszyCiagDodatnich(int[] tab) {
        int maxDlugosc = 0, dlugosc = 0;
        for(int num : tab){
            if(num > 0) {
                dlugosc++;
                maxDlugosc = Math.max(maxDlugosc, dlugosc);
            } else {
                dlugosc = 0;
            }
        }
        return maxDlugosc;
    }
    public static int najdluzszyCiagUjemnych(int[] tab){
        int maxDlugosc = 0, dlugosc = 0;
        for(int num : tab) {
            if(num < 0) {
                dlugosc++;
                maxDlugosc = Math.max(maxDlugosc, dlugosc);
            } else {
                dlugosc = 0;
            }
        }
        return maxDlugosc;
    }
    public static void odwrocTablice(int[] tab) {
        int lewy = 0, prawy = tab.length - 1;
        while (lewy < prawy) {
            int temp = tab[lewy];
            tab[lewy] = tab [prawy];
            tab[prawy] = temp;
            lewy++;
            prawy--;
        }
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop){
        if (indeksStart < 0 || indeksStop >= tab.length || indeksStart >= indeksStop) {
            System.out.println("Nieprawidłowe indeksy!");
            return;
        }
        while (indeksStart < indeksStop) {
            int temp = tab[indeksStart];
            tab[indeksStart] = tab[indeksStop];
            tab[indeksStop] = temp;
            indeksStart++;
            indeksStop--;
        }
    }

    //zad7

    public static int[] generujZakres(int n, int minWarotsc, int maxWartosc) {
        int[] tablica = new int[n];
        if(n <= 1){
            System.out.println("Liczba elementów musi być większa niż 1");
            return tablica;
        }
        double krok = (double)(maxWartosc - minWarotsc) / (n-1);
        for(int i = 0; i < n; i++){
            tablica[i] = (int) (minWarotsc + i * krok);
        }
        return tablica;
    }

    public static void main(String[] args) {

        //zad1
        int[] tablica = generujTablice(10, -5, 5);
        for (int liczba : tablica) {
            System.out.println(liczba + " ");
        }

        //zad2
        int[] tablica2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        wypiszTablice(tablica2, 3, 4);


        //zad3

        System.out.println("Liczba nieparzystych: " + ileNieparzystych(tablica));
        System.out.println("Liczba parzystych: " + ileParzystych(tablica));
        System.out.println("Liczba dodatnich: " + ileDadatnich(tablica));
        System.out.println("Liczba ujemnych: " + ileUjemnych(tablica));
        System.out.println("Liczba zerowych: " + ileZerowych(tablica));
        System.out.println("Liczba maksymalnych: " + ileMaxymalnych(tablica));
        System.out.println("Liczba minimalnych: " + ileMinimalnych(tablica));
        System.out.println("Liczba unikalnych: " + ileUnikalnych(tablica));


        //zad4

        System.out.println("Suma dodatnich: " + sumaDodatnich(tablica));
        System.out.println("Suma ujemnych: " + sumaUjemnych(tablica));
        System.out.println("Suma odwrotności: " + sumaOdwrotnosci(tablica));
        System.out.println("Średnia arytmetyczna: " + sredniaArytmetyczna(tablica));
        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tablica));
        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tablica));



        //zad5

        int[] wynikLiniowa = funkcjaLiniowa(tablica, 2, 3);
        int[] wynikKwadratowa = funkcjaKwadratowa(tablica, 1, -1, 2);
        double[] wynikWykladnicza = funkcjaWykladnicza(tablica, 2);
        int[] wynikSignum = funkcjaSignum(tablica);

        System.out.println("Wynik funkcji linowej: ");
        for(int val : wynikLiniowa) System.out.print(val + " ");
        System.out.println();

        System.out.println("Wynik funkcji kwadratowej: ");
        for (int val : wynikKwadratowa) System.out.print(val + " ");
        System.out.println();

        System.out.println("Wynik funkcji wykładniczej: ");
        for(double val : wynikWykladnicza) System.out.print(val + " ");
        System.out.println();

        System.out.println("Wynik funkcji signum: ");
        for (int val : wynikSignum) System.out.print(val + " ");
        System.out.println();

        //zad6

        System.out.println("Najdłuższy ciąg dodatnich: " + najdluzszyCiagDodatnich(tablica));
        System.out.println("Najdłuższy ciąg ujemnych: " + najdluzszyCiagUjemnych(tablica));

        System.out.println("Tablica przed odwróceniem: ");
        for(int num : tablica) System.out.print(num + " ");
        System.out.println();

        odwrocTablice(tablica);
        System.out.println("Tablica po odwróceniu: ");
        for(int num : tablica) System.out.print(num + " ");
        System.out.println();

        odwrocTablice(tablica, 2, 7);
        System.out.println("Tablica po odwróceniu od indeksu 2 do 7: ");
        for (int num : tablica) System.out.print(num + " ");
        System.out.println();

        //zad7
        int[] tablicaZakres = generujZakres(10,0,20);
        System.out.println("Wygenerowany zakres z równymi odstępami:");
        for(int val : tablicaZakres) System.out.print(val + " ");
    }
}
