// zad 3
class VideoPlayer implements MediaPlayer {
    private String currentTrack;
    @Override
    public void play(String trackName){
        this.currentTrack = trackName;
        System.out.println("Odtwarzanie pliku video: " + trackName);
    }

    @Override
    public void pause(){
        System.out.println("Plik video zatrzymany: " + currentTrack);
    }

    @Override
    public String getCurrentTrack(){
        return currentTrack;
    }
}
