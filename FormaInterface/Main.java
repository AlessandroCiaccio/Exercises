public class Main {
    public static void main(String[] args){
        Rettangolo rettangolo = new Rettangolo(NumeroAngoli.Quattro);
        Triangolo triangolo = new Triangolo(NumeroAngoli.Tre);
        triangolo.setBase(5.2F);
        triangolo.setHeight(12F);
        rettangolo.setSideA(20.3F);
        rettangolo.setSideB(18.5F);
        rettangolo.calcoloArea();
        triangolo.calcoloArea();
        System.out.println("Il rettangolo ha "+rettangolo.getAngoli()+" angoli");
        System.out.println("Il triangolo ha "+triangolo.getAngoli()+" angoli");
    }
}
