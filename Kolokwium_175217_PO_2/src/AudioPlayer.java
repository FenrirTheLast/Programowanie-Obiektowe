// zad 3
public class AudioPlayer implements MediaPlayer {
    private  String currentTrack;
    @Override
    public void play(String trackName){
        this.currentTrack = trackName;
        System.out.print("Odtwarzanie pliku audio: " + trackName);
    }
    @Override
    public void pause(){
        System.out.println("Zatrzymano Audio:" + currentTrack);
    }

    @Override
    public String getCurrentTrack(){
        return currentTrack;
    }
}
