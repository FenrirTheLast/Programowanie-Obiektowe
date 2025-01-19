// zad 2
abstract class ComputerGraphic {
    protected int width;
    protected int height;
    protected String fileName;

    public ComputerGraphic(int width, int height, String fileName){
        this.fileName = fileName;
        this.height = height;
        this.width = width;
    }

    public abstract void loadFile();
    public abstract void saveFile();

}

