public class Main {
    public static void main(String[] args){
        int x=21;
        
        System.out.println("The number "+x+" is even? "+evenOdd(x));
    }
    public static boolean evenOdd(int x){
        return x%2==0;
    }
}