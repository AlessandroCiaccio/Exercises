public class Main {
    public static void main(String[] args){
        int x=3, y=2;

        mol_incremento(x,y);
    }
    public static void mol_incremento(int x, int y){
        x+=2;
        y+=4;
        System.out.println("The multiplication of "+x+" and "+y+" is " +x*y);
    }
}