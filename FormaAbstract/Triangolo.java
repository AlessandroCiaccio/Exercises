public class Triangolo extends Forma{
    public float base;
    public float altezza;

    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {

        System.out.println("L'area del triangolo è " + (base*altezza)/2);
    }
}
