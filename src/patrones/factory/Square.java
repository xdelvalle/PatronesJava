package patrones.factory;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Dentro de Square.draw()..");
    }
}
