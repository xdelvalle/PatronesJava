package patrones.factory;

/**
 * Factory: Creaci�n de objetos sin exponer la logica de creaci�n al cliente
 *
 * http://www.java2s.com/Tutorials/Java/Java_Design_Patterns/0010__Java_Factory_Pattern.htm
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory.getInstance().getShape("CIRCLE").draw();
        ShapeFactory.getInstance().getShape("SQUARE").draw();
        ShapeFactory.getInstance().getShape("RECTANGLE").draw();
    }
}
