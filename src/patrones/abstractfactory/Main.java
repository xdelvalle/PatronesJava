package patrones.abstractfactory;

/**
 * AbstractFactory es una Factory de factories
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0020__Java_Abstract_Factory_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();


        AbstractFactory printerFactory = FactoryProducer.getFactory("PRINTER");

        printerFactory.getPrinter("Paper").print();
        printerFactory.getPrinter("Web").print();
        printerFactory.getPrinter("Screen").print();
    }
}
