import java.util.ArrayList;
import java.util.List;

public class Counter<T> {
    private List<T> elements; // Lista przechowująca dodane elementy

    // konstruktor
    public Counter(){
        elements = new ArrayList<>();
    }

    //Metoda dodająca element do listy
    public void add(T element) {
        elements.add(element);
    }

    //Metoda zwaracająca liczbę dodanych elementów
    public int getCount(){
        return elements.size();
    }
    public static void main(String[] args) {
        // Przykłady użycia klasy Counter

        // Counter dla String
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Hello");
        stringCounter.add("World");
        System.out.println("String Counter: " + stringCounter.getCount()); // 2

        // Counter dla Integer
        Counter<Integer> integerCounter = new Counter<>();
        integerCounter.add(1);
        integerCounter.add(2);
        integerCounter.add(3);
        System.out.println("Integer Counter: " + integerCounter.getCount()); // 3

        // Counter dla Double
        Counter<Double> doubleCounter = new Counter<>();
        doubleCounter.add(3.14);
        System.out.println("Double Counter: " + doubleCounter.getCount()); // 1
    }
}
