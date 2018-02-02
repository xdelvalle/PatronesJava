package patrones.factory;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Dentro de Rectangle.draw()..");
    }
}
