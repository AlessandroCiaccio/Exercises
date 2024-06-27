public class Rettangolo implements Forme{
    public float sideA;
    public float sideB;
    private final NumeroAngoli angoli;

    public Rettangolo(NumeroAngoli angoli) {
        this.angoli = angoli;
    }

    public NumeroAngoli getAngoli() {
        return angoli;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    @Override
    public void calcoloArea() {
        System.out.println("L'area del rettangolo è "+(sideA*sideB));
    }
}
