public class Triangolo extends Forma {
    public int base;
    public int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcoloArea(){
        System.out.println("L'area del triangolo è " + (base*altezza)/2);
    };
}
