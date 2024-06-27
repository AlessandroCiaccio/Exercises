public class ShapeFactory {


    public static Shape draw(EnumShape shape) {
        switch (shape) {
            case Circle -> {
                Shape circle = new Circle("CIRCLE");
                return circle;
            }
            case Square -> {
                Shape square = new Square("SQUARE");
                return square;
            }
            case Triangle -> {
                return new Triangle("TRIANGLE");
            }
            default -> {
                return null;
            }
        }
    }
}
