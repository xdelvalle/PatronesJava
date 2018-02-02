package patrones.facade;

public class ShapeFacade {

    interface IShape {
        void draw();
    }

    class Rectangle implements IShape {
        @Override
        public void draw() {
            System.out.println("Rectangle.draw()");
        }
    }

    class Square implements IShape {
        @Override
        public void draw() {
            System.out.println("Square.draw()");
        }
    }

    class Circle implements IShape {
        @Override
        public void draw() {
            System.out.println("Circle.draw()");
        }
    }



    private IShape circle = new Circle();
    private IShape rectangle = new Rectangle();
    private IShape square = new Square();

    public ShapeFacade() { }

    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
}
