public class MyClass {
    public static void main(String args[]) {
      String str="Alessandro";
      lung(str);
    }
    
    public static void lung(String str) {
        if (str.length()>10){
            System.out.println("Lunghezza maggiore di 10");
        } else if (str.length()==10){
            System.out.println("Lunghezza pari a 10");
        } else {
            System.out.println("Lunghezza minore di 10");
        }
    }
}