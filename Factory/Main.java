import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        System.out.print("Input the shape that you want between: Circle, Square, Triangle --> ");
        EnumShape shapeType = EnumShape.valueOf(scanner.next());

        shape = ShapeFactory.draw(shapeType);
        System.out.println(shape);

    }
}
