package patrones.adapter;

/**
 * Adapter: Es un conversor que trabaja como puente entre dos interfaces incompatibles
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0060__Java_Adapter_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play("MP3", "myAudio.mp3");
        player.play("AVI", "muVideo.avi");
    }
}
