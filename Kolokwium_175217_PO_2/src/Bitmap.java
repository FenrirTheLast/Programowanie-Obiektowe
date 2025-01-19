// zad 2
class Bitmap extends ComputerGraphic {
    public Bitmap(int width,int height, String filName){
        super(width, height, filName);
    }
    @Override
    public void loadFile(){
        System.out.println("Wczytywanie Bitmapy: " + fileName);
    }
    @Override
    public void saveFile(){
        System.out.println("Zapis Bitmapy: " + fileName);
    }
}
