public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Oval oval = new Oval();

        ShapePrinter sp = new ConsoleShapePrinter();

        sp.print(circle);
        sp.print(quad);
        sp.print(triangle);
        sp.print(rectangle);
        sp.print(oval);
    }
}