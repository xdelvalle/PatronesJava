package patrones.abstractfactory;

public class ScreenPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Dentro de ScreenPrinter.print()..");
    }
}
