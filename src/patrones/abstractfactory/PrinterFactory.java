package patrones.abstractfactory;

class PrinterFactory extends AbstractFactory {

    @Override
    IPrinter getPrinter(String type) {
        if(type == null)
            return null;

        if(type.equalsIgnoreCase("paper"))
            return new PaperPrinter();
        else if(type.equalsIgnoreCase("web"))
            return new WebPrinter();
        else if(type.equalsIgnoreCase("Screen"))
            return new ScreenPrinter();
        else
            return null;
    }

    @Override
    IShape getShape(String type) {
        return null;
    }
}
