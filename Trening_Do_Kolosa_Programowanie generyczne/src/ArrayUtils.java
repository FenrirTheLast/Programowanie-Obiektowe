import java.util.Arrays;

public class ArrayUtils {

    // Statyczna metoda generyczna swap
    public static <T> void swap(T[] array, int index1, int index2) {
        // Sprawdzenie, czy indeksy są w zakresie
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null.");
        }
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Indeksy są poza zakresem tablicy.");
        }

        // Zamiana elementów miejscami
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Przykłady użycia metody swap

        // Tablica Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Przed zamianą: " + Arrays.toString(intArray));
        swap(intArray, 0, 2);
        System.out.println("Po zamianie: " + Arrays.toString(intArray));

        // Tablica String
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        System.out.println("\nPrzed zamianą: " + Arrays.toString(stringArray));
        swap(stringArray, 1, 3);
        System.out.println("Po zamianie: " + Arrays.toString(stringArray));

        // Tablica Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("\nPrzed zamianą: " + Arrays.toString(doubleArray));
        swap(doubleArray, 0, 3);
        System.out.println("Po zamianie: " + Arrays.toString(doubleArray));

        // Przykład z nieprawidłowymi indeksami (spowoduje wyjątek)
        try {
            swap(intArray, 0, 10);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("\nBłąd: " + e.getMessage());
        }
    }
}