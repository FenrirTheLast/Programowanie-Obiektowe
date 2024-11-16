import java.util.Scanner;
import java.util.Arrays;
public class Kolokwium1 {

    //zad1

    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int r){
        int[] ciag = new int[n];
        for(int i = 0; i < n; i++){
            ciag[i] = a1 + (i * m) *r;
        }
        return ciag;
    }

    //zad2
    public static boolean czyCiagArytmetyczny (int[] tab){
        if(tab.length < 2) return false;
        int r = tab[1] - tab[0];
        for (int i = 1; i < tab.length; i++){
            if(tab[i] - tab[i -1] != r){
                return false;
            }
        }
        return true;
    }

    //zad3

    public static boolean czyCiagArytmetyczyRodzajuM(int[] tab, int m){
        if(tab.length < 2) return false;
        for (int i = m; i < tab.length; i++){
            if(tab[i] - tab[i-m] != tab[1] - tab[0]){
                return false;
            }
        }
        return true;
    }

    //zad4
    public static int podciag(int[] tab){
        int maxPodciag = 1;
        int orginalnyPodciag = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] > tab[i-1]){
                orginalnyPodciag++;
                maxPodciag = Math.max(maxPodciag, orginalnyPodciag);
            } else {
                orginalnyPodciag = 1;
            }
        }
        return maxPodciag;
    }

    //zad5
    public static int podciag(int[] tab, int r){
        int maxPodciag = 1;
        int orginalnyPodciag = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] - tab[i-1] == r){
                orginalnyPodciag++;
                maxPodciag = Math.max(maxPodciag, orginalnyPodciag);
            } else {
                orginalnyPodciag = 1;
            }
        }
        return maxPodciag;
    }


    //zad 6
    public static void sekwencjaCollatza(int n, int c){
        int orginalny = c;
        System.out.print("Sekwencja Collatze: " + orginalny);

        for(int i = 1; i < n; i++){
            if(orginalny % 2 == 0){
                orginalny /= 2;
            } else {
                orginalny = 3 * orginalny + 1;
            }
            System.out.print(", " + orginalny);
        }
        System.out.println();
    }

    //zad7
    public static void minMaxsekwencjaCollatze(int n, int c){
        int orginalny = c;
        int min = orginalny;
        int max = orginalny;

        for(int i = 0; i < n; i++){
            if(orginalny < min){
                min = orginalny;
            }
            if(orginalny > max){
                max = orginalny;
            }
            if(orginalny % 2 == 0){
                orginalny /= 2;
            } else {
                orginalny = 3 * orginalny + 1;
            }
        }
        System.out.print("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {

        //zad1
        int[] ciag = ciagArytmetycznyRodzajuM(5, 1,2,4);
        System.out.println("Ciąg arytmetyczny " + Arrays.toString(ciag));


        //zad2
        int[] tab1 = {2, 5, 8, 11, 14};
        System.out.println("Czy tablica 1 jest ciagiem arytmetycznym? " + czyCiagArytmetyczny(tab1));

        //zad3

        int[] tab2 = {4, 5, 6, 10, 20};
        System.out.println("Czy tablica 2 jest ciągiem arytmetycznym rodzaju m=2? " + czyCiagArytmetyczyRodzajuM(tab2, 2));

        //zad4
        int[] tab3 = {1, 2, 3, 1, 2, 3, 1, 2, 5};
        System.out.println("Najdłuższy podciąg rosnący tablicy 3 ma długość: " + podciag(tab3));

        //zad5
        int[] tab5 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("Najdłuższy podciąg o różnicy r = 2 ma długosć: " + podciag(tab5, 2));

        //zad6
        sekwencjaCollatza(10,6);

        //zad7
        minMaxsekwencjaCollatze(10,6);




    }
}