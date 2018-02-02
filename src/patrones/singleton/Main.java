package patrones.singleton;

/**
 * Singleton: Patron de instancia única
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0030__Java_Singleton_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        MainWindow.getInstance().showMessage();
    }
}
