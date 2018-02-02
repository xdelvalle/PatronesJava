package patrones.adapter;

public class Player implements IPlayer {
    AudioPlayer audioPlayer = new AudioPlayer();
    VideoPlayer videoPlayer = new VideoPlayer();

    public Player() { }

    @Override
    public void play(String type, String fileName) {
        if(type.equalsIgnoreCase("AVI"))
            videoPlayer.playVideo(fileName);
        else if(type.equalsIgnoreCase("MP3"))
            audioPlayer.playAudio(fileName);

    }
}
