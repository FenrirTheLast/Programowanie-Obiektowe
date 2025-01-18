// Klasa Animal
class Animal {
    private String name;
    private int age;

    // Konstruktor
    public Animal(String name, int age) {
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

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}