public class Triangle implements Form{
    private Float base;
    private Float high;
    @Override
    public Float calculateArea() {
        return base*high/2;
    }

    public Triangle(Float base, Float high) {
        this.base = base;
        this.high = high;
    }
}
