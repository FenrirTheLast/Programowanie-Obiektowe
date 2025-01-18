
public class Main {

    // Generyczna metoda isEqual
    public static <T> boolean isEqual(T obj1, T obj2) {
        // Sprawdzanie równości obiektów
        if (obj1 == null && obj2 == null) {
            return true; // Oba obiekty są null
        }
        if (obj1 == null || obj2 == null) {
            return false; // Tylko jeden z obiektów jest null
        }
        return obj1.equals(obj2); // Porównanie metodą equals
    }

    public static void main(String[] args) {

        // Tworzenie instancji klasy Box dla różnych typów

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Java!");
        System.out.println("String Box: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(42);
        System.out.println("Integer Box: " + integerBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println("Double box: " + doubleBox.get());

        //Przykłady użycia metody isEqual

        // Porównanie dwóch Stringów
        System.out.println("Porównanie Stringów: " + isEqual("Java", "Java")); // true
        System.out.println("Porównanie Stringów: " + isEqual("Java", "Python")); // false

        // Porównanie dwóch liczb
        System.out.println("Porównanie Integerów: " + isEqual(10, 10)); // true
        System.out.println("Porównanie Integerów: " + isEqual(10, 20)); // false

        // Porównanie dwóch obiektów typu Double
        System.out.println("Porównanie Double: " + isEqual(3.14, 3.14)); // true
        System.out.println("Porównanie Double: " + isEqual(3.14, 2.71)); // false

        // Porównanie obiektu z null
        System.out.println("Obiekt z null: " + isEqual(null, "Java")); // false
        System.out.println("Dwa null: " + isEqual(null, null)); // true
    }

}