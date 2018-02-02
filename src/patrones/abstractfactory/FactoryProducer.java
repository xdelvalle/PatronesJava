package patrones.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE"))
            return new ShapeFactory();
        else if(choice.equalsIgnoreCase("PRINTER"))
            return new PrinterFactory();
        else
            return null;

    }
}
