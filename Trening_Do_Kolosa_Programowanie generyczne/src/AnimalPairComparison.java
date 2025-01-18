// Klasa główna z metodą findMax
public class AnimalPairComparison {

    // Generyczna metoda findMax
    public static <T extends Animal> T findMax(Pair<? extends T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();

        // Porównanie obiektów na podstawie wieku
        return first.getAge() > second.getAge() ? first : second;
    }

    public static void main(String[] args) {
        // Przykład 1: Pair dla Animal
        Animal cat = new Animal("Cat", 5);
        Animal rabbit = new Animal("Rabbit", 3);
        Pair<Animal> animalPair = new Pair<>(cat, rabbit);

        Animal olderAnimal = findMax(animalPair);
        System.out.println("Starsze zwierzę: " + olderAnimal); // Cat (5 years)

        // Przykład 2: Pair dla Dog
        Dog dog1 = new Dog("Buddy", 4);
        Dog dog2 = new Dog("Max", 7);
        Pair<Dog> dogPair = new Pair<>(dog1, dog2);

        Dog olderDog = findMax(dogPair);
        System.out.println("Starszy pies: " + olderDog); // Max (7 years)
    }
}