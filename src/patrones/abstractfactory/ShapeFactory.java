package patrones.abstractfactory;

class ShapeFactory extends AbstractFactory {

    @Override
    IPrinter getPrinter(String type) {
        return null;
    }

    @Override
    IShape getShape(String shapeType) {
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else
            return null;
    }
}
