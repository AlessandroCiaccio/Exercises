public class Main {
    public static void main(String[] args){
        int x=5, y=13, c=12;
        System.out.println("The number "+c+" is between "+x+" and "+y+"? "+compreso(x,y,c));
    }
    public static boolean compreso(int x, int y, int c){
        return x<=c && y>=c;
    }
}