package patrones.adapter;

public class VideoPlayer implements IVideoPlayer {

    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}
