// Definicja klasy generycznej Box
public class Box <T> {
    private T object; // POle przechowujące obiekt dowolnego typu

    //Metoda do ustawiania obiektu
    public void set(T object) {
        this.object = object;
    }

    // Metoda do pobierania obiektu
    public T get() {
        return object;
    }

}
