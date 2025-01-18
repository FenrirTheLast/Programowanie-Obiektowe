// Klasa generyczna Pair
class Pair<T> {
    private T first;
    private T second;

    // Konstruktor
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Setter dla pierwszego elementu
    public void setFirst(T first) {
        this.first = first;
    }

    // Setter dla drugiego elementu
    public void setSecond(T second) {
        this.second = second;
    }

    // Getter dla pierwszego elementu
    public T getFirst() {
        return first;
    }

    // Getter dla drugiego elementu
    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }
}
