public class ConsoleShapePrinter implements ShapePrinter {
    public void print(Shape shape){
        System.out.println(shape.getName());
    }

}
