// Klasa główna
public class MinValueExample {

    // Statyczna metoda generyczna minValue
    public static <T extends Comparable<T>> T minValue(T[] array) {
        // Zabezpieczenie przed pustą tablicą
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta.");
        }

        // Znalezienie najmniejszego elementu
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Przykłady użycia metody minValue

        // Tablica Integer
        Integer[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Najmniejsza wartość (Integer): " + minValue(intArray)); // 1

        // Tablica Double
        Double[] doubleArray = {2.5, 3.3, 1.1, 4.8};
        System.out.println("Najmniejsza wartość (Double): " + minValue(doubleArray)); // 1.1

        // Tablica String
        String[] stringArray = {"Banana", "Apple", "Cherry", "Date"};
        System.out.println("Najmniejsza wartość (String): " + minValue(stringArray)); // Apple

        // Tablica obiektów Person
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };
        System.out.println("Najmłodsza osoba: " + minValue(people)); // Bob (25 years)

        // Przykład z pustą tablicą (spowoduje wyjątek)
        try {
            Integer[] emptyArray = {};
            System.out.println(minValue(emptyArray));
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}