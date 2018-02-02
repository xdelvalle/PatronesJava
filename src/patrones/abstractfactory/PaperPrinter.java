package patrones.abstractfactory;

public class PaperPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Dentro de PaperPrinter.print()..");
    }
}
