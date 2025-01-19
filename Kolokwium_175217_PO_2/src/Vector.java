// zad 2
class Vector extends ComputerGraphic {
    public Vector(int width, int height, String fileName){
        super(width, height, fileName);
    }
    @Override
    public void loadFile(){
        System.out.println("Wczytywanie Vectora: " + fileName);
    }
    @Override
    public void saveFile(){
        System.out.println("Zapis Vactora: " + fileName);
    }
}
