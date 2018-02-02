package patrones.facade;

/**
 * Patrón Façade: Oculta la complejidad de un sistema. provee de una sola interfaz para interactuar con el sistema
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0120__Java_Facade_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
