import java.util.Random;

public class Main {


    //Napisz funkcję, która generuje tablicę liczb gdzie n oznacza ilość elementów tablicy, minWartosc wartość minimalną w tablicy, a maxWartosc wartość maksymalną.
    //generujTablice(n, minWartosc, maxWartosc)

    public static int[] stworzTablice(int n, int minWartosc, int maxWartosc){
        int[] tablica = new int[n];
        Random random = new Random();

        for(int i = 0; i < n; i++){
            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return tablica;
    }


    //Napisz funkcję, która wypisuje na ekranie tablice w formie macierzy o wymiarach n x m. W przypadku gdy n*m jest większe od długości tablicy program wypisuje puste pola. Zadbaj o to, aby liczby były ułożone równo.
    //wypiszTablice(tab, n, m)

    public static void WypiszTablice(int[] tablica,int n2, int m){
        int index = 0;
        for(int i = 0; i < n2; i++){
            for(int j = 0; j < m; j++){
                if(index < tablica.length){
                    System.out.printf("%4d", tablica[index]);
                    index++;
                } else {
                    System.out.printf("%4s", " ");
                }
            }
            System.out.println();
        }
    }


    //Wykorzystując funkcję z zadania 1. napisz funkcje zliczające ilość liczb w tablicy.
    //ileNieparzystych(tab) ileParzystych(tab) ileDodatnich(tab) ileUjemnych(tab) ileZerowych(tab) ileMaxymalnych(tab) ileMinimalnych(tab)
    //ileUnikalnych(tab)

    public static int ileNieparzystych(int[] tab){
        int count = 0;
        for (int liczba : tab){
            if (liczba % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static int ileParzystych(int[] tab){
        int count = 0;
        for (int liczba : tab){
            if(liczba % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int ileDodatnich(int[] tab){
        int count = 0;
        for(int liczba : tab){
            if(liczba > 0){
                count++;
            }
        }
        return count;
    }

    public static int ileUjemnych(int[] tab){
        int count = 0;
        for(int liczba : tab){
            if(liczba < 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileZerowych(int[] tab) {
        int count = 0;
        for(int liczba: tab) {
            if(liczba == 0){
                count++;
            }
        }
        return count;
    }

    public static int ileMaxymalnych(int[] tab) {
        int max = tab[0];
        for(int liczba : tab){
            if (liczba > max){
                max = liczba;
            }
        }
        int count = 0;
        for(int liczba : tab){
            if(liczba == max){
                count++;
            }
        }
        return count;
    }
    public static int ileMinimalnych(int[] tab){
        int min = tab[0];
        for(int liczba : tab){
            if(liczba < min){
                min = liczba;
            }
        }
        int count = 0;
        for(int liczba : tab){
            if(liczba == min){
                count++;
            }
        }
        return count;
    }
    public static int ileUnikalnych(int[] tab){
        int count = 0;
        for (int i = 0; i < tab.length; i++){
            boolean isUnique = true;
            for(int j = 0; j < tab.length; j++){
                if(i != j && tab[i] == tab[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                count++;
            }
        }
        return count;
    }


    //Wykorzystując funkcje z zadania 1. napisz funkcje wykonujące odpowiednie operacje arytmetyczne.
    //sumaDodatnich(tab)
    //sumaUjemnych(tab)
    //sumaOdwrotnosci(tab)
    //sredniaArytmetyczna(tab)
    //sredniaGeometryczna(tab)
    //sredniaHarmoniczna(tab)

    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for(int liczba : tab){
            if(liczba > 0){
                suma += liczba;
            }
        }
        return suma;
    }
    public static int SumaUjemnych (int[] tab){
        int suma = 0;
        for(int liczba : tab) {
            if(liczba < 0) {
                suma +=liczba;
            }
        }
        return suma;
    }
    public static double sumaOdwrotnosci(int[] tab) {
        double suma = 0.0;
        for(int liczba : tab){
            if(liczba != 0){
                suma += 1.0 / liczba;
            }
        }
        return suma;
    }
    public static double sredniaArytmetyczna(int[] tab){
        double suma = 0.0;
        for(int liczba : tab){
            suma += liczba;
        }
        return suma / tab.length;
    }
    public static double sredniaGeometryczna(int[] tab) {
        double iloczyn = 1.0;
        for (int liczba : tab){
            if(liczba <= 0) {
                return 0;
            }
            iloczyn *= liczba;
        }
        return Math.pow(iloczyn, 1.0 / tab.length);
    }

    public static double sredniaHarmoniczna(int[] tab) {
        double sumaOdwrotnosci = 0.0;
        for(int liczba : tab) {
            if(liczba != 0){
                sumaOdwrotnosci += 1.0 / liczba;
            }
        }
        return tab.length / sumaOdwrotnosci;
    }


    //Wykorzystując funkcję z zadania 1. napisz funkcje zwracające tablice wartości dla odpowiednich funkcji.
    //funkcjaLiniowa(tab, a, b) //ax+b
    //funkcjaKwadratowa(tab, a, b, c) //ax^2+bx+c
    //funkcjaWykladnicza(tab, a) //a^x
    //funkcjaSignum(tab)

    public static double[] funkcjaLiniowa(int[] tab, double a, double b){
        double[] wynik = new double[tab.length];
        for (int i = 0; i < tab.length; i++){
            wynik[i] = a * tab[i] + b;
        }
        return wynik;
    }

    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c){
        double [] wynik = new double[tab.length];
        for (int i = 0; i < tab.length; i++){
            wynik[i] = a * tab[i] * tab[i] + b * tab[i] + c;
        }
        return wynik;
    }

    public static double[] funkcjaWykładnicza(int[] tab, double a){
        double[] wynik = new double[tab.length];
        for(int i = 0; i < tab.length; i++){
            wynik[i] = Math.pow(a, tab[i]);
        }
        return wynik;
    }

    public static int[] funkcjaSignum(int[] tab){
        int[] wynik = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                wynik[i] = 1;
            } else if (tab[i] < 0){
                wynik[i] = -1;
            } else {
                wynik[i] = 0;
            }
        }
        return wynik;
    }

    public static void wypiszTablice(double[] tab){
        for(double liczba : tab){
            System.out.print(liczba + " ");
        }
        System.out.println();
    }

    public static void wypiszTablice(int[] tab){
        for(int liczba : tab){
            System.out.print(liczba + " ");
        }
        System.out.println();
    }



    //Wykorzystując funkcję z zadania 1. napisz funkcje, które wykonują odpowiednie
    // operacje na tablicy.
    //najdluzszyCiagDodatnich(tab) najdluzszyCiagUjemnych(tab)
    // odwrocTablice(tab) odwrocTablice(tab, indeksStart, indeksStop).

    public static int najdluzszyCiagDodatnich(int [] tab){
        int maxDlugosc = 0;
        int obecnaDlugosc = 0;

        for (int liczba : tab) {
            if(liczba > 0){
                obecnaDlugosc++;
                if(obecnaDlugosc > maxDlugosc){
                    maxDlugosc = obecnaDlugosc;
                }
            } else {
                obecnaDlugosc = 0;
            }
        }
        return maxDlugosc;
    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        int maxDlugosc = 0;
        int obecnaDlugosc = 0;

        for(int liczba : tab){
            if(liczba < 0){
                obecnaDlugosc++;
                if(obecnaDlugosc > maxDlugosc){
                    maxDlugosc = obecnaDlugosc;
                }
            } else {
                obecnaDlugosc = 0;
            }
        }
        return maxDlugosc;
    }

    public static void odwrocTablicde(int[] tab, int indeksStart, int indeksStop) {
        while (indeksStart < indeksStop){
            int temp = tab[indeksStart];
            tab[indeksStart] = tab[indeksStop];
            tab[indeksStop] = temp;

            indeksStart++;
            indeksStop--;
        }
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
        while(indeksStart < indeksStop){
            int temp = tab[indeksStart];
            tab[indeksStart] = tab[indeksStop];
            tab[indeksStop] = temp;

            indeksStart++;
            indeksStop--;
        }
    }

    public static void WypiszTablice(int[] tab) {
        for(int liczba : tab){
            System.out.print(liczba + " ");
        }
        System.out.println();
    }


    //Zmodyfikuj funkcję z zadania 1. w taki sposób, aby generowała tablicę,
    // której liczby są w równych odstępach od siebie.
    //generujZakres(n, minWartosc, maxWartosc).

    public static double[] generujZakres(int n, double minWartosc, double maxWartosc){
        double[] tablica = new double[n];
        if (n == 1) {
            tablica[0] = minWartosc; // Jeśli tylko jedna liczba, ustaw minWartosc
        } else {
            double krok = (maxWartosc - minWartosc) / (n - 1); // Równy odstęp między wartościami
            for (int i = 0; i < n; i++) {
                tablica[i] = minWartosc + i * krok;
            }
        }
        return tablica;
    }
    public static void wypiszTablice2(double[] tablica) {
        for(double liczba : tablica){
            System.out.print(liczba + " ");
        }
        System.out.println();
    }



    public static void main(String[] args){

        //Napisz funkcję, która generuje tablicę liczb gdzie n oznacza ilość elementów tablicy,
        // minWartosc wartość minimalną w tablicy, a maxWartosc wartość maksymalną.
        //generujTablice(n, minWartosc, maxWartosc)

        int n = 6;
        int minWartosc = 2;
        int maxWartosc = 12;

        int[] tablica = stworzTablice(n, minWartosc, maxWartosc);
        System.out.println("Stworzona Tablica: ");
        for(int liczba : tablica){
            System.out.print(liczba + " ");
        }
        System.out.println();


        //Napisz funkcję, która wypisuje na ekranie tablice w formie macierzy o wymiarach n x m.
        // W przypadku gdy n*m jest większe od długości tablicy program wypisuje puste pola.
        // Zadbaj o to, aby liczby były ułożone równo.
        //wypiszTablice(tab, n, m)

        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8};
        int n2 = 3;
        int m = 4;
        System.out.println("Macierz: ");
        WypiszTablice(tab, n2, m);


        //Wykorzystując funkcję z zadania 1. napisz funkcje zliczające ilość liczb w tablicy.
        //ileNieparzystych(tab) ileParzystych(tab) ileDodatnich(tab) ileUjemnych(tab)
        // ileZerowych(tab) ileMaxymalnych(tab) ileMinimalnych(tab)
        //ileUnikalnych(tab)

        int[] tablica2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, 9 ,3 ,4, 5, 6, 1};
        System.out.println("Nieparzyste: " + ileNieparzystych(tablica2));
        System.out.println("Parzyste: " + ileParzystych(tablica2));
        System.out.println("Dodatnie: " + ileDodatnich(tablica2));
        System.out.println("Ujemne: " + ileUjemnych(tablica2));
        System.out.println("Zerowe: " + ileZerowych(tablica2));
        System.out.println("Maksymalne: " + ileMaxymalnych(tablica2));
        System.out.println("Minimalne: " + ileMinimalnych(tablica2));
        System.out.println("Unikalne: " + ileUnikalnych(tablica2));


        //Wykorzystując funkcje z zadania 1. napisz funkcje wykonujące odpowiednie
        // operacje arytmetyczne.
        //sumaDodatnich(tab)
        //sumaUjemnych(tab)
        //sumaOdwrotnosci(tab)
        //sredniaArytmetyczna(tab)
        //sredniaGeometryczna(tab)
        //sredniaHarmoniczna(tab)


        int[] tablica3 = {1, -2, 3, -4, 5, 0, 0, -4};
        System.out.println("Suma dodadnich liczb: " + sumaDodatnich(tablica3));
        System.out.println("Suma ujemnych: " + SumaUjemnych(tablica3));
        System.out.println("Suma odwrotności: " + sumaOdwrotnosci(tablica3));
        System.out.println("Średnia arytmetyczna: " + sredniaArytmetyczna(tablica3));
        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tablica3));
        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tablica3));


        //Wykorzystując funkcję z zadania 1. napisz funkcje zwracające tablice wartości
        // dla odpowiednich funkcji.
        //funkcjaLiniowa(tab, a, b) //ax+b
        //funkcjaKwadratowa(tab, a, b, c) //ax^2+bx+c
        //funkcjaWykladnicza(tab, a) //a^x
        //funkcjaSignum(tab)

        int[] tablica4 = {1, -2, 3, 0, -1};

        double[] liniowa = funkcjaLiniowa(tablica4, 2, 4);
        System.out.print("Funkcja liniowa (2x + 3): ");
        wypiszTablice(liniowa);

        double[] kwadratowa = funkcjaKwadratowa(tablica4, 1, 3, 5);
        System.out.print("Funkcja kwadratowa (x^2 - x + 2): ");
        wypiszTablice(kwadratowa);

        double[] wykładnicza = funkcjaWykładnicza(tablica4, 4);
        System.out.print("Funkcja wykładnicza (2^x): ");
        wypiszTablice(wykładnicza);

        int[] signum = funkcjaSignum(tablica4);
        System.out.print("Funkcja signum: ");
        wypiszTablice(signum);

        //Wykorzystując funkcję z zadania 1. napisz funkcje,
        // które wykonują odpowiednie operacje na tablicy.
        //najdluzszyCiagDodatnich(tab) najdluzszyCiagUjemnych(tab)
        // odwrocTablice(tab) odwrocTablice(tab, indeksStart, indeksStop).

        int[] tablica5 = {1, -1, 2, 3, -2, -3, -4, 4, 5, 6};

        System.out.println("Najdłuższy ciąg dodatnich: " + najdluzszyCiagDodatnich(tablica5));
        System.out.println("Najdłuższy ciąg ujemnych: " + najdluzszyCiagUjemnych(tablica5));
        System.out.print("Tablica przed odwróceniem: ");
        wypiszTablice(tablica5);
        odwrocTablicde(tablica5, 3, 6);
        System.out.print("Tablica po odwróceniu: ");
        WypiszTablice(tablica5);

        System.out.print("Fragment tablicy przed odwróceniem (2 do 6): ");
        wypiszTablice(tablica5);
        odwrocTablicde(tablica5, 2, 6);
        System.out.print("Fragment tablicy po odwróceniu (2 do 6): ");
        WypiszTablice(tablica5);



        //Zmodyfikuj funkcję z zadania 1. w taki sposób,
        //aby generowała tablicę, której liczby są w równych odstępach od siebie.
        //generujZakres(n, minWartosc, maxWartosc).

        int n6 = 5;
        double minWartosc2 = 1.0;
        double maxWartosc2 = 10.0;

        double[] zakres = generujZakres(n6, minWartosc2, maxWartosc2);
        System.out.print("Wygenerowana tablica: ");
        wypiszTablice2(zakres);


        }

    }

