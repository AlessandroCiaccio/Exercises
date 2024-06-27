public class Triangolo implements Forme{
    public float base;
    public float height;
    private final NumeroAngoli angoli;

    public Triangolo(NumeroAngoli angoli) {
        this.angoli = angoli;
    }

    public NumeroAngoli getAngoli() {
        return angoli;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del triangolo è "+(base*height)/2);
    }
}
