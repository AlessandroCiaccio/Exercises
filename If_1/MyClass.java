public class MyClass {
    public static void main(String args[]) {
      // Ciclo for
      int x;
      for (x=1; x<=100; x++){
          control(x);
      }
    }
    
    public static void control(int x) {
        if (x%15==0){
            System.out.println("FizzBuzz");
        } else if (x%5==0){
            System.out.println("Buzz");
        } else if (x%3==0){
            System.out.println("Fizz");
        } else {
            System.out.println(x);
        }
        
    }
}