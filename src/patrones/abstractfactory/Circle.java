package patrones.abstractfactory;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Dentro de Circle.draw()..");
    }
}
