public class MyClass {
    public static void main(String args[]) {
      String sym="/";
      operation(sym);
    }
    
    public static void operation(String x){
        switch (x){
            case "+":
                System.out.println("Addizione");
                break;
            case "-":
                System.out.println("Sottrazione");
                break;
            case "*":
                System.out.println("Moltiplicazione");
                break;
            case "/":
                System.out.println("Divisione");
                break;
            default:
                System.out.println("Error");
        }
    }
}