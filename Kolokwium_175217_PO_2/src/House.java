// Zad1
public class House extends Building {
    private int numberOfRooms;

    public House(double height, String color, int numberOfRooms){
        super(height, color);
        this.numberOfRooms = numberOfRooms;

    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
