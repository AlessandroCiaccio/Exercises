public class MyClass {
    public static void main(String args[]) {
      int x=6;
      somma(x);
    }
    public static void somma(int x){
        int i=0, sum=0;
        while (i<x){
            sum+=i;
            i++;
        }
        System.out.println("The sum is: "+sum);

    }
    
}