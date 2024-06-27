public class Square implements Shape {
    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
