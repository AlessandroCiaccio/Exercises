public class Triangle implements Shape {
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                '}';
    }
}
