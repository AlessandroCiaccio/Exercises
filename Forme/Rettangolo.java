public class Rettangolo extends Forma{
    private int latoA;
    private int latoB;

    public Rettangolo(int latoA, int latoB) {
        this.latoA = latoA;
        this.latoB = latoB;
    }
    @Override
    public void calcoloArea(){
        System.out.println("L'area del rettangolo è " + (latoA*latoB));
    };

}
