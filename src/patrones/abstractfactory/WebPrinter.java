package patrones.abstractfactory;

public class WebPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Dentro de WebPrinter.print()..");
    }
}
