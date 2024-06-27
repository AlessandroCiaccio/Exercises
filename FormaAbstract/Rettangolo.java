public class Rettangolo extends Forma{
    public float latoA;
    public float latoB;

    public Rettangolo(float latoA, float latoB) {
        this.latoA = latoA;
        this.latoB = latoB;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è " + (latoA*latoB));
    }
}
