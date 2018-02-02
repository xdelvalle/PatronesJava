package patrones.abstractfactory;

public abstract class AbstractFactory {
    abstract IPrinter getPrinter(String type);
    abstract IShape getShape(String type);
}
