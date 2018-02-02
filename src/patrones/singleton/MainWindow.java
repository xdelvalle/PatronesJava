package patrones.singleton;

public class MainWindow {
    private static MainWindow instance = new MainWindow();

    private MainWindow() { }

    public void showMessage() {
        System.out.println("Hello Singleton!");
    }

    public static MainWindow getInstance() {
        return instance;
    }
}
