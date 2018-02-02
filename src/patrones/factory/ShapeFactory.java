package patrones.factory;

public class ShapeFactory {
    private static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {}

    public IShape getShape(String shapeType) {
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else
            return null;
    }

    public static ShapeFactory getInstance() {
        return instance;
    }
}
