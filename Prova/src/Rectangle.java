public class Rectangle implements  Form{
    private Float side1;
    private Float side2;
    @Override
    public Float calculateArea(){
        return side1*side2;
    }

    public Rectangle(Float side1, Float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}
