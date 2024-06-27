public class Main {
    public static void main(String[] args){
        char x='a', y='A';
        System.out.println("The characters are "+x+" and "+y);
        System.out.println("They are equal? "+comparazione(x,y));
    }
    public static boolean comparazione(char x, char y){
        return x==y;
    }
}