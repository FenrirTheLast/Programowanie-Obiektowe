// Klasa główna z metodą findMax
public class AnimalComparison {

    // Generyczna metoda findMax
    public static <T extends Animal> T findMax(T element1, T element2) {
        if (element1.getAge() > element2.getAge()) {
            return element1;
        } else {
            return element2;
        }
    }

    public static void main(String[] args) {
        // Tworzenie obiektów Animal
        Animal cat = new Animal("Cat", 5);
        Animal rabbit = new Animal("Rabbit", 3);

        // Porównanie obiektów Animal
        Animal olderAnimal = findMax(cat, rabbit);
        System.out.println("Starsze zwierzę: " + olderAnimal); // Cat (5 years)

        // Tworzenie obiektów Dog
        Dog dog1 = new Dog("Buddy", 4);
        Dog dog2 = new Dog("Max", 7);

        // Porównanie obiektów Dog
        Dog olderDog = findMax(dog1, dog2);
        System.out.println("Starszy pies: " + olderDog); // Max (7 years)
    }
}