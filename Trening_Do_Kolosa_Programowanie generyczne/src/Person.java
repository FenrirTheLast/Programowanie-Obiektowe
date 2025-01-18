import java.util.Arrays;

// Klasa pomocnicza Person
class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dla nazwy
    public String getName() {
        return name;
    }

    // Getter dla wieku
    public int getAge() {
        return age;
    }

    // Implementacja porównywania na podstawie wieku
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}