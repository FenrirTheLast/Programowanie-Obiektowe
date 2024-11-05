import java.beans.Introspector;
import java.sql.Array;
import java.util.*;
import java.util.HashMap;

public class Zestaw5 {

    //zad1

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> nowaLista = new ArrayList<>(tab1);
        nowaLista.addAll(tab2);
        return nowaLista;
    }

    //zad2
    public static ArrayList<Integer> merge(ArrayList<Integer> tab_1, ArrayList<Integer> tab_2){
        ArrayList<Integer> nowaLista = new ArrayList<>();
        int maxRozmiar = Math.max(tab_1.size(), tab_2.size());

        for(int i = 0; i < maxRozmiar; i++){
            if(i < tab_1.size()){
                nowaLista.add(tab_1.get(i));
            }
            if(i < tab_2.size()) {
                nowaLista.add(tab_2.get(i));
            }
        }
        return nowaLista;
    }

    //zad3

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab__1, ArrayList<Integer> tab__2){
        ArrayList<Integer> nowaLista = new ArrayList<>(tab__1);
        nowaLista.addAll(tab__2);
        Collections.sort(nowaLista);
        return nowaLista;
    }

    //zad4
    public static ArrayList<Character> toArrayList(String napis){
        ArrayList<Character> listaZnakow = new ArrayList<>();

        for(char znak: napis.toCharArray()){
            listaZnakow.add(znak);
        }
        Collections.sort(listaZnakow);
        return listaZnakow;
    }

    public static ArrayList<Integer> toArrayList(int liczba) {
        ArrayList<Integer> listaCyfr = new ArrayList<>();

        String liczbaString = Integer.toString(liczba);
        for(char cyfra : liczbaString.toCharArray()) {
            listaCyfr.add(Character.getNumericValue(cyfra));
        }
        Collections.sort(listaCyfr);
        return listaCyfr;
    }

    //zad5
    public static ArrayList<Character> toArrayList2(String napis2){
        ArrayList<Character> listaZnakow2 = new ArrayList<>();
        for(char znak2 : napis2.toCharArray()) {
            listaZnakow2.add(znak2);
        }
        Collections.sort(listaZnakow2);
        return listaZnakow2;
    }
    public static ArrayList<Integer> toArrayList2(int liczba2){
        ArrayList<Integer> listaCyfr = new ArrayList<>();
        String liczbaString = Integer.toString(liczba2);
        for (char cyfra2 : liczbaString.toCharArray()){
            listaCyfr.add(Character.getNumericValue(cyfra2));
        }
        Collections.sort(listaCyfr);
        return listaCyfr;
    }
    public static boolean checkChar(ArrayList<Character> tab, char znak2){
        return tab.contains(znak2);
    }
    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra2) {
        return tab.contains(cyfra2);
    }

    //zad6

    public static ArrayList<Character> toArrayList3(String napis3){
        ArrayList<Character> listaZnakow3 = new ArrayList<>();
        for(char znak3 : napis3.toCharArray()){
            listaZnakow3.add(znak3);
        }
        Collections.sort(listaZnakow3);
        return listaZnakow3;
    }

    public static ArrayList<Integer> toArrayList3(int liczba) {
        ArrayList<Integer> listaCyfr = new ArrayList<>();
        String liczbaString = Integer.toString(liczba);
        for(char cyfra : liczbaString.toCharArray()){
            listaCyfr.add(Character.getNumericValue(cyfra));
        }
        Collections.sort(listaCyfr);
        return listaCyfr;
    }
    public static int countChar(ArrayList<Character> tab, char znak){
        int licznik = 0;
        for(char element : tab){
            if(element == znak){
                licznik++;
            }
        }
        return licznik;
    }
    public static int countDigit(ArrayList<Integer> tab, int cyfra){
        int licznik = 0;
        for (int element : tab){
            if(element == cyfra) {
                licznik++;
            }
        }
        return licznik;
    }

    //zad7

    public static ArrayList<ArrayList<Object>> uniqueStringArrayList(ArrayList<String> tab) {
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        HashSet<String> unikalneWartosci = new HashSet<>(tab);
        for(String wartosc : unikalneWartosci) {
            ArrayList<Object> para = new ArrayList<>();
            para.add(wartosc);
            para.add(0);
            wynik.add(para);
        }
        return wynik;
    }
     public static ArrayList<ArrayList<Object>>  uniqueIntegerArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        HashSet<Integer> unikalneWartosci = new HashSet<>(tab);
        for (Integer wartosc : unikalneWartosci) {
            ArrayList<Object> para = new ArrayList<>();
            para.add(wartosc);
            para.add(0);
            wynik.add(para);
        }
        return wynik;
     }

     //zad 8
    public static ArrayList<ArrayList<Object>> countArrayList2(ArrayList<String> tab){
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        HashMap<String, Integer> mapa = new HashMap<>();

        for(String znak : tab) {
            mapa.put(znak, mapa.getOrDefault(znak, 0) + 1);
        }
        for (String klucz : mapa.keySet()){
            ArrayList<Object> para = new ArrayList<>();
            para.add(klucz);
            para.add(mapa.get(klucz));
            wynik.add(para);
        }
        return wynik;
    }

    public static ArrayList<ArrayList<Object>> countArrayList(ArrayList<Integer> tab){
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for(Integer liczba : tab) {
            mapa.put(liczba, mapa.getOrDefault(liczba, 0) + 1);
        }
        for(Integer klucz : mapa.keySet()) {
            ArrayList<Object> para = new ArrayList<>();
            para.add(klucz);
            para.add(mapa.get(klucz));
            wynik.add(para);
        }
        return wynik;
    }



    public static void main(String[] args) {

        //zad1

        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);

        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);

        ArrayList<Integer> wynik = append(tab1, tab2);
        System.out.println("Połączona lista " + wynik);

        //zad2

        ArrayList<Integer> tab_1 = new ArrayList<>();
        tab_1.add(1);
        tab_1.add(3);
        tab_1.add(5);

        ArrayList<Integer> tab_2 = new ArrayList<>();
        tab_2.add(2);
        tab_2.add(4);
        tab_2.add(6);
        tab_2.add(8);
        tab_2.add(10);

        ArrayList<Integer> wynik_2 = merge(tab_1, tab_2);

        System.out.println("Połączona lista naprzemiennie: " + wynik_2);


        //zad3
        ArrayList<Integer> tab__1 = new ArrayList<>();
        tab__1.add(1);
        tab__1.add(4);
        tab__1.add(7);

        ArrayList<Integer> tab__2 = new ArrayList<>();
        tab__2.add(2);
        tab__2.add(3);
        tab__2.add(6);
        tab__2.add(8);

        ArrayList<Integer> wynik__ = mergeSorted(tab__1, tab__2);
        System.out.println("Połączona i posortowana lista: " + wynik__);


        //zad4

        String napis = "java";
        int liczba = 7345274;

        ArrayList<Character> wynikZnakow = toArrayList(napis);
        ArrayList<Integer> wynikCyfr = toArrayList(liczba);

        System.out.println("Posortowana lista znaków z napisu: " + wynikZnakow);
        System.out.println("Posortowana lista cyfr z liczby: " + wynikCyfr);

        //zad5
        String napis2 = "Java";
        ArrayList<Character> listaZnakow2 = toArrayList2(napis2);
        char znak2 = 'a';
        System.out.println("Lista znaków: " + listaZnakow2);
        System.out.println("Czy znak '" + znak2 + "' jest w liście? " + checkChar(listaZnakow2, znak2));

        int liczba2 = 35463;
        ArrayList<Integer> listaCyfr = toArrayList(liczba2);
        int cyfra = 4;
        System.out.println("Lista cyfr: " + listaCyfr);
        System.out.println("Czy cyfra '" + cyfra + "' jest w liście? " + checkDigit(listaCyfr, cyfra));

        //zad6
        String napis3 = "Radiologia";
        ArrayList<Character> listaZnakow3 = toArrayList(napis3);
        char znak3 = 'a';
        System.out.println("Lista znaków: " + listaZnakow3);
        System.out.println("Liczba wystąpień znaku '" + znak3 + "': " + countChar(listaZnakow3, znak3));

        int liczba3 = 5478576;
        ArrayList<Integer> listaCyfr3 = toArrayList3(liczba3);
        int cyfra3 = 7;
        System.out.println("Lista cyfr: " + listaCyfr3);
        System.out.println("Liczba wystąpień cyfry '" + cyfra3 + "': " + countDigit(listaCyfr3, cyfra3));

        //zad7
        ArrayList<String> listaZnakow = new ArrayList<>();
        listaZnakow.add("a");
        listaZnakow.add("b");
        listaZnakow.add("a");
        listaZnakow.add("c");

        ArrayList<ArrayList<Object>> wynikZnakow2 =  uniqueStringArrayList(listaZnakow);
        System.out.println("Dwuwymiarowa lista unikalnych wartości (String): " + wynikZnakow2);

        ArrayList<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(1);
        listaLiczb.add(4);
        listaLiczb.add(5);
        listaLiczb.add(5);
        listaLiczb.add(7);
        listaLiczb.add(7);

        ArrayList<ArrayList<Object>> wynikLiczb = uniqueIntegerArrayList(listaLiczb);
        System.out.println("Dwumiarowa lista unikalnych wartości (Integer): " + wynikLiczb);

        //zad8
        ArrayList<String> listaZnakow_2 = new ArrayList<>();
        listaZnakow_2.add("a");
        listaZnakow_2.add("b");
        listaZnakow_2.add("a");
        listaZnakow_2.add("c");
        listaZnakow_2.add("b");

        ArrayList<ArrayList<Object>> wynikZnakow3 = countArrayList2(listaZnakow_2);
        System.out.println("Dwuwymiarowa lista zliczeń wartości (String): " + wynikZnakow3);

        ArrayList<Integer> listaLiczb2 = new ArrayList<>();
        listaLiczb2.add(1);
        listaLiczb2.add(4);
        listaLiczb2.add(5);
        listaLiczb2.add(5);
        listaLiczb2.add(7);
        listaLiczb2.add(7);

        ArrayList<ArrayList<Object>> wynikLiczb2 = countArrayList(listaLiczb2);
        System.out.println("Dwuwymiarowa lista zliczeń wartości (Integer): " + wynikLiczb2);

        }
    }
