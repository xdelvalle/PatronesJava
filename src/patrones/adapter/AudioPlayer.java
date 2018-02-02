package patrones.adapter;

public class AudioPlayer implements IAudioPlayer {

    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing Audio: " + fileName);
    }
}
