// Klasa główna
public class DogAgeFinder {

    // Statyczna metoda findMinMaxAge
    public static void findMinMaxAge(Dog[] dogs, Pair<? super Dog> result) {
        if (dogs == null || dogs.length == 0) {
            throw new IllegalArgumentException("Tablica psów nie może być pusta.");
        }

        Dog minDog = dogs[0];
        Dog maxDog = dogs[0];

        // Znalezienie psa z minimalnym i maksymalnym wiekiem
        for (Dog dog : dogs) {
            if (dog.getAge() < minDog.getAge()) {
                minDog = dog;
            }
            if (dog.getAge() > maxDog.getAge()) {
                maxDog = dog;
            }
        }

        // Zapisanie wyników w obiekcie Pair
        result.setFirst(minDog);
        result.setSecond(maxDog);
    }

    public static void main(String[] args) {
        // Tworzenie tablicy psów
        Dog[] dogs = {
                new Dog("Buddy", 4),
                new Dog("Max", 7),
                new Dog("Bella", 2),
                new Dog("Charlie", 5)
        };

        // Tworzenie obiektu Pair
        Pair<Animal> result = new Pair<>(null, null);

        // Wywołanie metody findMinMaxAge
        findMinMaxAge(dogs, result);

        // Wyświetlenie wyników
        System.out.println("Najmłodszy pies: " + result.getFirst());
        System.out.println("Najstarszy pies: " + result.getSecond());
    }
}
