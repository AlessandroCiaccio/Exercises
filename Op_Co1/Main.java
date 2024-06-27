public class Main {
    public static void main(String[] args){
        int x=2, y=2;
        System.out.println("The numbers are "+x+" and "+y);
        System.out.println("They are equal? "+comparazione(x,y));
    }
    public static boolean comparazione(int x, int y){
        return x==y;
    }
}